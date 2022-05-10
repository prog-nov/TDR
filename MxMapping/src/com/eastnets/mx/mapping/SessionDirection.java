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
 * <p>Java class for SessionDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ToMessagePartner"/&gt;
 *     &lt;enumeration value="FromMessagePartner"/&gt;
 *     &lt;enumeration value="ToAndFromMessagePartner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SessionDirection")
@XmlEnum
public enum SessionDirection {

    @XmlEnumValue("ToMessagePartner")
    TO_MESSAGE_PARTNER("ToMessagePartner"),
    @XmlEnumValue("FromMessagePartner")
    FROM_MESSAGE_PARTNER("FromMessagePartner"),
    @XmlEnumValue("ToAndFromMessagePartner")
    TO_AND_FROM_MESSAGE_PARTNER("ToAndFromMessagePartner");
    private final String value;

    SessionDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionDirection fromValue(String v) {
        for (SessionDirection c: SessionDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
