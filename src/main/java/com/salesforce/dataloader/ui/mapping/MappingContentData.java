/*
 * Copyright (c) 2012, salesforce.com, inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.salesforce.dataloader.ui.mapping;

public class MappingContentData {

	private String CSVValue;
	private String SFValue;
	private String SampleData;
	
	public MappingContentData(){
		
	}
	
	public MappingContentData(String CSVValue,String SFValue,String SampleData){
		this.setCSVValue(CSVValue);
		this.setSFValue(SFValue);
		this.setSampleData(SampleData);
	}

	/**
	 * @return the cSVValue
	 */
	public String getCSVValue() {
		return CSVValue;
	}

	/**
	 * @param cSVValue the cSVValue to set
	 */
	public void setCSVValue(String cSVValue) {
		if(cSVValue == null)
			cSVValue ="";
		CSVValue = cSVValue;
	}

	/**
	 * @return the sFValue
	 */
	public String getSFValue() {
		return SFValue;
	}

	/**
	 * @param sFValue the sFValue to set
	 */
	public void setSFValue(String sFValue) {
		if(sFValue == null)
			sFValue="";
		SFValue = sFValue;
	}

	/**
	 * @return the sampleData
	 */
	public String getSampleData() {
		return SampleData;
	}

	/**
	 * @param sampleData the sampleData to set
	 */
	public void setSampleData(String sampleData) {
		if(sampleData == null)
			sampleData="";
		if(sampleData.length()>100)
			sampleData = sampleData.substring(0,100)+" ...";
		SampleData = sampleData;
	}
	
	@Override
	public String toString(){
		return CSVValue+" -> "+SFValue;
	}
	
	
}
