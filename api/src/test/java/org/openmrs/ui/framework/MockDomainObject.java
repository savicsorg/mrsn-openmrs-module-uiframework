/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.ui.framework;

import java.util.List;
import java.util.Map;

public class MockDomainObject {

	private String name;
	private List<Integer> numbers;
	private Map<String, Integer> map;
	
	public MockDomainObject() { }
	
    /**
     * @return the name
     */
    public String getName() {
    	return name;
    }
	
    /**
     * @param name the name to set
     */
    public void setName(String name) {
    	this.name = name;
    }
	
    /**
     * @return the numbers
     */
    public List<Integer> getNumbers() {
    	return numbers;
    }
	
    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(List<Integer> numbers) {
    	this.numbers = numbers;
    }

    /**
     * @return the map
     */
    public Map<String, Integer> getMap() {
    	return map;
    }
	
    /**
     * @param map the map to set
     */
    public void setMap(Map<String, Integer> map) {
    	this.map = map;
    }
		
}