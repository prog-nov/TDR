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
package com.eastnets.resilience.xmldump.parser;

import java.util.List;

import com.eastnets.resilience.xsd.InputStartEntry;

/**
 * File parsing
 * 
 * @author EHakawati
 * 
 */
public interface Parser {

	public boolean startParsing();

	public List<? extends InputStartEntry> getNextBatch();

	public void endParsing();

	public Class<? extends InputStartEntry> getObjectsType();
}
