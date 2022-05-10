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
 * <p>Java class for SecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsSigningRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RMAResult" type="{urn:swift:saa:xsd:saa.2.0}RMAResult" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FINSecurityInfo" type="{urn:swift:saa:xsd:saa.2.0}FINSecurityInfo"/&gt;
 *           &lt;element name="SWIFTNetSecurityInfo" type="{urn:swift:saa:xsd:saa.2.0}SWIFTNetSecurityInfo"/&gt;
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
@XmlType(name = "SecurityInfo", propOrder = {
    "isSigningRequested",
    "rmaResult",
    "finSecurityInfo",
    "swiftNetSecurityInfo"
})
public class SecurityInfo {

    @XmlElement(name = "IsSigningRequested")
    protected Boolean isSigningRequested;
    @XmlElement(name = "RMAResult")
    @XmlSchemaType(name = "string")
    protected RMAResult rmaResult;
    @XmlElement(name = "FINSecurityInfo")
    protected FINSecurityInfo finSecurityInfo;
    @XmlElement(name = "SWIFTNetSecurityInfo")
    protected SWIFTNetSecurityInfo swiftNetSecurityInfo;

    /**
     * Gets the value of the isSigningRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSigningRequested() {
        return isSigningRequested;
    }

    /**
     * Sets the value of the isSigningRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSigningRequested(Boolean value) {
        this.isSigningRequested = value;
    }

    /**
     * Gets the value of the rmaResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMAResult }
     *     
     */
    public RMAResult getRMAResult() {
        return rmaResult;
    }

    /**
     * Sets the value of the rmaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMAResult }
     *     
     */
    public void setRMAResult(RMAResult value) {
        this.rmaResult = value;
    }

    /**
     * Gets the value of the finSecurityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FINSecurityInfo }
     *     
     */
    public FINSecurityInfo getFINSecurityInfo() {
        return finSecurityInfo;
    }

    /**
     * Sets the value of the finSecurityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FINSecurityInfo }
     *     
     */
    public void setFINSecurityInfo(FINSecurityInfo value) {
        this.finSecurityInfo = value;
    }

    /**
     * Gets the value of the swiftNetSecurityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SWIFTNetSecurityInfo }
     *     
     */
    public SWIFTNetSecurityInfo getSWIFTNetSecurityInfo() {
        return swiftNetSecurityInfo;
    }

    /**
     * Sets the value of the swiftNetSecurityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWIFTNetSecurityInfo }
     *     
     */
    public void setSWIFTNetSecurityInfo(SWIFTNetSecurityInfo value) {
        this.swiftNetSecurityInfo = value;
    }

}
