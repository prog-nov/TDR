/**
 * Copyright (c) 2012 EastNets
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of EastNets ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with EastNets. 
 */
package com.eastnets.resilience.xsd.messaging;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Class")
@XmlEnum
public enum Class {
	NORMAL("MESG_NORMAL"), BROADCAST("MESG_BROADCAST"), SCISSOR("MESG_SCISSOR"), TEMPLATE("MESG_TEMPLATE");

	private String value;

	private Class(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

	public static Class fromValue(String paramString) {
		return valueOf(paramString);
	}

	@Override
	public String toString() {
		return value();
	}
}
