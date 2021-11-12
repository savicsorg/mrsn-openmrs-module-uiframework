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
package org.openmrs.ui.framework.converter;

import org.openmrs.PatientProgram;
import org.openmrs.api.context.Context;
import org.springframework.core.convert.converter.Converter;


/**
 * Treats the string as a pk id of a {@link PatientProgram}
 */
public class StringToPatientProgramConverter implements Converter<String, PatientProgram> {

	/**
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	@Override
	public PatientProgram convert(String source) {
	    return Context.getProgramWorkflowService().getPatientProgram(Integer.valueOf(source));
	}
	
}
