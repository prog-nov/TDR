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
package com.eastnets.resilience.xsd.eventjournal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.eastnets.resilience.xsd.eventjournal.Severity;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeverityList", propOrder = { "severity" })
public class SeverityList {

	@XmlElement(name = "Severity")
	protected List<Severity> severity;

	public List<Severity> getSeverity() {
		if (this.severity == null)
			this.severity = new ArrayList<Severity>();
		return this.severity;
	}
}
