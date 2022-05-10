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
 * <p>Java class for InterfaceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserReference" type="{urn:swift:saa:xsd:saa.2.0}UserReference" minOccurs="0"/&gt;
 *         &lt;element name="RoutingCode" type="{urn:swift:saa:xsd:saa.2.0}RoutingCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidationLevel" type="{urn:swift:saa:xsd:saa.2.0}ValidationLevel" minOccurs="0"/&gt;
 *         &lt;element name="IsModificationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInstruction" type="{urn:swift:saa:xsd:saa.2.0}RoutingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="MessageCreator" type="{urn:swift:saa:xsd:saa.2.0}MessageCreator" minOccurs="0"/&gt;
 *         &lt;element name="MessageContext" type="{urn:swift:saa:xsd:saa.2.0}MessageContext" minOccurs="0"/&gt;
 *         &lt;element name="MessageNature" type="{urn:swift:saa:xsd:saa.2.0}MessageNature" minOccurs="0"/&gt;
 *         &lt;element name="ProductInfo" type="{urn:swift:saa:xsd:saa.2.0}ProductList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceInfo", propOrder = {
    "userReference",
    "routingCode",
    "validationLevel",
    "isModificationAllowed",
    "routingInstruction",
    "messageCreator",
    "messageContext",
    "messageNature",
    "productInfo"
})
public class InterfaceInfo {

    @XmlElement(name = "UserReference")
    protected String userReference;
    @XmlElement(name = "RoutingCode")
    protected String routingCode;
    @XmlElement(name = "ValidationLevel")
    @XmlSchemaType(name = "string")
    protected ValidationLevel validationLevel;
    @XmlElement(name = "IsModificationAllowed")
    protected Boolean isModificationAllowed;
    @XmlElement(name = "RoutingInstruction")
    protected RoutingInstruction routingInstruction;
    @XmlElement(name = "MessageCreator")
    @XmlSchemaType(name = "string")
    protected MessageCreator messageCreator;
    @XmlElement(name = "MessageContext")
    @XmlSchemaType(name = "string")
    protected MessageContext messageContext;
    @XmlElement(name = "MessageNature")
    @XmlSchemaType(name = "string")
    protected MessageNature messageNature;
    @XmlElement(name = "ProductInfo")
    protected ProductList productInfo;

    /**
     * Gets the value of the userReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserReference() {
        return userReference;
    }

    /**
     * Sets the value of the userReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserReference(String value) {
        this.userReference = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the validationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationLevel }
     *     
     */
    public ValidationLevel getValidationLevel() {
        return validationLevel;
    }

    /**
     * Sets the value of the validationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationLevel }
     *     
     */
    public void setValidationLevel(ValidationLevel value) {
        this.validationLevel = value;
    }

    /**
     * Gets the value of the isModificationAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModificationAllowed() {
        return isModificationAllowed;
    }

    /**
     * Sets the value of the isModificationAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModificationAllowed(Boolean value) {
        this.isModificationAllowed = value;
    }

    /**
     * Gets the value of the routingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInstruction }
     *     
     */
    public RoutingInstruction getRoutingInstruction() {
        return routingInstruction;
    }

    /**
     * Sets the value of the routingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInstruction }
     *     
     */
    public void setRoutingInstruction(RoutingInstruction value) {
        this.routingInstruction = value;
    }

    /**
     * Gets the value of the messageCreator property.
     * 
     * @return
     *     possible object is
     *     {@link MessageCreator }
     *     
     */
    public MessageCreator getMessageCreator() {
        return messageCreator;
    }

    /**
     * Sets the value of the messageCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageCreator }
     *     
     */
    public void setMessageCreator(MessageCreator value) {
        this.messageCreator = value;
    }

    /**
     * Gets the value of the messageContext property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContext }
     *     
     */
    public MessageContext getMessageContext() {
        return messageContext;
    }

    /**
     * Sets the value of the messageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContext }
     *     
     */
    public void setMessageContext(MessageContext value) {
        this.messageContext = value;
    }

    /**
     * Gets the value of the messageNature property.
     * 
     * @return
     *     possible object is
     *     {@link MessageNature }
     *     
     */
    public MessageNature getMessageNature() {
        return messageNature;
    }

    /**
     * Sets the value of the messageNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageNature }
     *     
     */
    public void setMessageNature(MessageNature value) {
        this.messageNature = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductList }
     *     
     */
    public ProductList getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductList }
     *     
     */
    public void setProductInfo(ProductList value) {
        this.productInfo = value;
    }

}
