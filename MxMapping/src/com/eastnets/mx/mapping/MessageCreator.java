//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.23 at 04:31:47 PM EET 
//


package com.eastnets.mx.mapping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageCreator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageCreator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ApplicationInterface"/&gt;
 *     &lt;enumeration value="SWIFTNetInterface"/&gt;
 *     &lt;enumeration value="FINInterface"/&gt;
 *     &lt;enumeration value="Workstation"/&gt;
 *     &lt;enumeration value="Messenger"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageCreator")
@XmlEnum
public enum MessageCreator {

    @XmlEnumValue("ApplicationInterface")
    APPLICATION_INTERFACE("ApplicationInterface"),
    @XmlEnumValue("SWIFTNetInterface")
    SWIFT_NET_INTERFACE("SWIFTNetInterface"),
    @XmlEnumValue("FINInterface")
    FIN_INTERFACE("FINInterface"),
    @XmlEnumValue("Workstation")
    WORKSTATION("Workstation"),
    @XmlEnumValue("Messenger")
    MESSENGER("Messenger"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MessageCreator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageCreator fromValue(String v) {
        for (MessageCreator c: MessageCreator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}