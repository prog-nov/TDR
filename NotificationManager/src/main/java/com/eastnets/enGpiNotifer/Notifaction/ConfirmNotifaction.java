package com.eastnets.enGpiNotifer.Notifaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eastnets.domain.viewer.DataSource;
import com.eastnets.domain.viewer.DaynamicMsgDetailsParam;
import com.eastnets.domain.viewer.MessageDetails;
import com.eastnets.domain.viewer.NotifierMessage;
import com.eastnets.enGpiNotifer.DAO.*;
import com.eastnets.enGpiNotifer.builder.MessageBulder;
import com.eastnets.enGpiNotifer.config.AppConfigBean;
import com.eastnets.enGpiNotifer.parser.MTType;
import com.eastnets.enGpiNotifer.parser.RjeMessageParser;
import com.eastnets.enGpiNotifer.service.GpiService;
import com.eastnets.enGpiNotifer.utility.DataSourceParser;
import com.eastnets.enGpiNotifer.utility.GpiHelper;
import com.eastnets.enGpiNotifer.utility.Queue;
import com.eastnets.service.ServiceLocator;
import com.google.common.collect.Lists;

public class ConfirmNotifaction {
	private static final Logger LOGGER = Logger.getLogger(ConfirmNotifaction.class);

	private ServiceLocator serviceLocator;
	private LoaderDAO loaderDAO;
	private AppConfigBean appConfigBean; 
	private Map<String, MTType> mtTypesMap = null ;
	private RjeMessageParser rjeMessageParser;


	public void notifyByWriteConfirmation(List<NotifierMessage> messagesList,DataSourceParser dataSourceParser ,RjeMessageParser rjeMessageParser){ 
		this.rjeMessageParser=rjeMessageParser;
		List<NotifierMessage> notifierMessages=getMessagesForConfirmation(messagesList,dataSourceParser);
		if(!notifierMessages.isEmpty()){
			for (List<NotifierMessage> messages : Lists.partition(notifierMessages, dataSourceParser.getxMLNotifierConfigHelper().getBulkSize())) { 
				LOGGER.debug("Start building Msg confirmation bulk"); 	 
				notifyBulkConfirmation(messages, dataSourceParser); 
				LOGGER.debug("End building Msg confirmation bulk");
			}			
		}
	}



	private List<NotifierMessage> getMessagesForConfirmation(List<NotifierMessage> messages,DataSourceParser dataSourceParser) {
		List<NotifierMessage> notifierMessages=new ArrayList<NotifierMessage>();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		String curuntDate = ""; 
		for(NotifierMessage message:messages){
			curuntDate = formater.format(new Date());
			if(message.getConfirmAtempt() >= dataSourceParser.getxMLNotifierConfigHelper().getConfirmAttempts() || !GpiService.isMsgExceededDuration(message.getConfirmAttemptsDateTimeStr(),curuntDate,dataSourceParser.getxMLNotifierConfigHelper().getDurationTime())){ 
				continue;
			}else{
				notifierMessages.add(message);
			} 
		}
		return notifierMessages;
	}



	private void notifyBulkConfirmation(List<NotifierMessage> messages,DataSourceParser dataSourceParser){ 
		try {
			String rjeConfirmationStr = generateRJEConfirmation(messages,dataSourceParser.getxMLNotifierConfigHelper().getQueueMap(),dataSourceParser);
			if(!rjeConfirmationStr.isEmpty()){ 
				GpiHelper.writeConfirmation(rjeConfirmationStr,dataSourceParser.getxMLNotifierConfigHelper().getFilePathRJE() ); 
				GpiHelper.moveBack(dataSourceParser.getxMLNotifierConfigHelper().getFilePathRJE()+"/temp", dataSourceParser.getxMLNotifierConfigHelper().getFilePathRJE() );
				LOGGER.debug("Start updating on ldGpiNotifersHistory");	 
				updateldGpiNotifersHistoryForConfirmation(messages,dataSourceParser);  
				LOGGER.debug("End updating on ldGpiNotifersHistory"); 

			}
		} catch (Exception e) {
			for(NotifierMessage message:messages){
				message.setWriteConfirmation(false);
			}
			LOGGER.info("Failed writing confirmation"); 
			serviceLocator.getViewerService().insertIntoErrorld("GPINotifier", "Failed", "GPINotifier", " while notifyByWriteConfirmation() : Failed writing confirmation", null);
			e.printStackTrace();
		}

	}

	private void updateldGpiNotifersHistoryForConfirmation(List<NotifierMessage> resultMessages,DataSourceParser dataSourceParser){ 
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		String curuntDate = "";
		for(NotifierMessage entity:resultMessages){
			curuntDate = formater.format(new Date());
			if(entity.isWriteConfirmation() && GpiService.isMsgExceededDuration(entity.getConfirmAttemptsDateTimeStr(),curuntDate,dataSourceParser.getxMLNotifierConfigHelper().getDurationTime())){
				try {
					loaderDAO.insertConfirmatioAttempt(entity);
				} catch (Exception e) {
					if(e.getMessage().contains("Violation of PRIMARY KEY constraint")  || e.getMessage().contains("unique constraint (SIDE.PK_LDGPINOTIFERSHISTORY) violated") ||   e.getMessage().contains("unique constraint (SIDE.PK_LDGPINOTIFERSMQHISTORY)") || e.getMessage().contains("unique constraint (SIDE.PK_LDGPINOTIFERSDBHISTORY)")){
						loaderDAO.updateConfirmatioAttempt(entity);
					}
				} 
				}   
			}
	}



	private DaynamicMsgDetailsParam buildLaodMsgParam(String loggedInUser, int aid, int umidl, int umidh, Date mesg_crea_date){ 
		DaynamicMsgDetailsParam daynamicMsgDetailsParam=new DaynamicMsgDetailsParam();
		daynamicMsgDetailsParam.setLoggedInUser(loggedInUser);
		daynamicMsgDetailsParam.setAid(aid);
		daynamicMsgDetailsParam.setUmidh(umidh);
		daynamicMsgDetailsParam.setUmidl(umidl);
		daynamicMsgDetailsParam.setMesg_crea_date(mesg_crea_date); 
		daynamicMsgDetailsParam.setTimeZoneOffset(0);
		daynamicMsgDetailsParam.setIncludeHistory(false);
		daynamicMsgDetailsParam.setIncludeMessageNotes(false);
		return daynamicMsgDetailsParam; 

	}

	public String generateRJEConfirmation(List<NotifierMessage> messages,Map<String, Queue> QueuesMap,DataSourceParser dataSourceParser) throws InterruptedException {

		String result = "";
		boolean addNewLine = false;
		boolean isFirstMessage= true;
		MessageDetails messageDetails=null;
		for (NotifierMessage message : messages) { 

			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
			if (addNewLine) {
				result += "\r\n";
			}
			try { 

				if(message.getDataSource().equals(DataSource.SAA)){
					DaynamicMsgDetailsParam daynamicMsgDetailsParam = buildLaodMsgParam(appConfigBean.getUsername(), message.getAid(),
							message.getMesgUmidl(), message.getMesgUmidh(), message.getMesgCreaDateTimeOnDB());
					messageDetails = serviceLocator.getViewerService()
							.getMessageDetails(daynamicMsgDetailsParam);				
				}else{

					messageDetails =  rjeMessageParser.parse(message.getMessageText());				
				}

				LOGGER.debug((message.getDataSource().equals(DataSource.SAA)) ? "Start Build RJE For Message: "+ "UMIDL: "+message.getMesgUmidl()+" , UMIDH: "+message.getMesgUmidh()+" , AID: "+message.getAid():"Start Build RJE For Message: "+ "Message Key:"+message.getMesgID()  ); 
				result += new MessageBulder().buildRJE(message,messageDetails, false, !isFirstMessage,QueuesMap,dataSourceParser); 

				LOGGER.debug((message.getDataSource().equals(DataSource.SAA)) ? "End Build RJE For Message: "+ "UMIDL: "+message.getMesgUmidl()+" , UMIDH: "+message.getMesgUmidh()+" , AID: "+message.getAid():"END Build RJE For Message: "+ "Message Key:"+message.getMesgID()  ); 
				message.setWriteConfirmation(true);
				isFirstMessage = false;

			} catch (Exception ex) { 
				serviceLocator.getViewerService().insertIntoErrorld("GPINotifier", "Failed", "GPINotifier",	(message.getDataSource().equals(DataSource.SAA)) ? "Eroor Build RJE For Message: "+ "UMIDL: "+message.getMesgUmidl()+" , UMIDH: "+message.getMesgUmidh()+" , AID: "+message.getAid():"Eroor Build RJE For Message:  "+ "Message Key:"+message.getMesgID()  , null);

				ex.printStackTrace();
			}

			addNewLine = true;
		}
		return result;
	}



	public Map<String, MTType> getMtTypesMap() {
		return mtTypesMap;
	}



	public void setMtTypesMap(Map<String, MTType> mtTypesMap) {
		this.mtTypesMap = mtTypesMap;
	}



	public RjeMessageParser getRjeMessageParser() {
		return rjeMessageParser;
	}



	public void setRjeMessageParser(RjeMessageParser rjeMessageParser) {
		this.rjeMessageParser = rjeMessageParser;
	}



	public ServiceLocator getServiceLocator() {
		return serviceLocator;
	}


	public void setServiceLocator(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}


	public LoaderDAO getLoaderDAO() {
		return loaderDAO;
	}


	public void setLoaderDAO(LoaderDAO loaderDAO) {
		this.loaderDAO = loaderDAO;
	}


	public AppConfigBean getAppConfigBean() {
		return appConfigBean;
	}


	public void setAppConfigBean(AppConfigBean appConfigBean) {
		this.appConfigBean = appConfigBean;
	}


}