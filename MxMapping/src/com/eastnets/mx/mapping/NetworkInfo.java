//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.23 at 04:31:47 PM EET 
//


package com.eastnets.mx.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priority" type="{urn:swift:saa:xsd:saa.2.0}Priority" minOccurs="0"/&gt;
 *         &lt;element name="IsPossibleDuplicate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateHistory" type="{urn:swift:saa:xsd:saa.2.0}PDEPDM" minOccurs="0"/&gt;
 *         &lt;element name="IsNotificationRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{urn:swift:saa:xsd:saa.2.0}Service" minOccurs="0"/&gt;
 *         &lt;element name="Network" type="{urn:swift:saa:xsd:saa.2.0}Network" minOccurs="0"/&gt;
 *         &lt;element name="SessionNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SeqNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FINNetworkInfo" type="{urn:swift:saa:xsd:saa.2.0}FINNetworkInfo"/&gt;
 *           &lt;element name="SWIFTNetNetworkInfo" type="{urn:swift:saa:xsd:saa.2.0}SWIFTNetNetworkInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInfo", propOrder = {
    "priority",
    "isPossibleDuplicate",
    "duplicateHistory",
    "isNotificationRequested",
    "service",
    "network",
    "sessionNr",
    "seqNr",
    "finNetworkInfo",
    "swiftNetNetworkInfo"
})
public class NetworkInfo {

    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected Priority priority;
    @XmlElement(name = "IsPossibleDuplicate")
    protected Boolean isPossibleDuplicate;
    @XmlElement(name = "DuplicateHistory")
    protected PDEPDM duplicateHistory;
    @XmlElement(name = "IsNotificationRequested")
    protected Boolean isNotificationRequested;
    @XmlElement(name = "Service")
    protected String service;
    @XmlElement(name = "Network")
    @XmlSchemaType(name = "string")
    protected Network network;
    @XmlElement(name = "SessionNr")
    protected Integer sessionNr;
    @XmlElement(name = "SeqNr")
    protected Integer seqNr;
    @XmlElement(name = "FINNetworkInfo")
    protected FINNetworkInfo finNetworkInfo;
    @XmlElement(name = "SWIFTNetNetworkInfo")
    protected SWIFTNetNetworkInfo swiftNetNetworkInfo;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the isPossibleDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPossibleDuplicate() {
        return isPossibleDuplicate;
    }

    /**
     * Sets the value of the isPossibleDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPossibleDuplicate(Boolean value) {
        this.isPossibleDuplicate = value;
    }

    /**
     * Gets the value of the duplicateHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PDEPDM }
     *     
     */
    public PDEPDM getDuplicateHistory() {
        return duplicateHistory;
    }

    /**
     * Sets the value of the duplicateHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDEPDM }
     *     
     */
    public void setDuplicateHistory(PDEPDM value) {
        this.duplicateHistory = value;
    }

    /**
     * Gets the value of the isNotificationRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotificationRequested() {
        return isNotificationRequested;
    }

    /**
     * Sets the value of the isNotificationRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotificationRequested(Boolean value) {
        this.isNotificationRequested = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the sessionNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionNr() {
        return sessionNr;
    }

    /**
     * Sets the value of the sessionNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionNr(Integer value) {
        this.sessionNr = value;
    }

    /**
     * Gets the value of the seqNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNr() {
        return seqNr;
    }

    /**
     * Sets the value of the seqNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNr(Integer value) {
        this.seqNr = value;
    }

    /**
     * Gets the value of the finNetworkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FINNetworkInfo }
     *     
     */
    public FINNetworkInfo getFINNetworkInfo() {
        return finNetworkInfo;
    }

    /**
     * Sets the value of the finNetworkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FINNetworkInfo }
     *     
     */
    public void setFINNetworkInfo(FINNetworkInfo value) {
        this.finNetworkInfo = value;
    }

    /**
     * Gets the value of the swiftNetNetworkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SWIFTNetNetworkInfo }
     *     
     */
    public SWIFTNetNetworkInfo getSWIFTNetNetworkInfo() {
        return swiftNetNetworkInfo;
    }

    /**
     * Sets the value of the swiftNetNetworkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWIFTNetNetworkInfo }
     *     
     */
    public void setSWIFTNetNetworkInfo(SWIFTNetNetworkInfo value) {
        this.swiftNetNetworkInfo = value;
    }

}