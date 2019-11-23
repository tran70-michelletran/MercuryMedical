package com.mercurymedical.model;

import java.io.Serializable;

public class MedicalTest implements Serializable{
	
	private int testId;
	private String testName;
	private String testType;
	private String keyIndicators;
	private String testDate;
	private int testOrderInfo;
	private String testDoctor;
	/**
	 * 
	 */
	public MedicalTest() {
		super();
	}
	/**
	 * @param testId
	 * @param testName
	 * @param testType
	 * @param keyIndicators
	 * @param testDate
	 * @param testOrderInfo
	 * @param testDoctor
	 */
	public MedicalTest(int testId, String testName, String testType, String keyIndicators, String testDate,
			int testOrderInfo, String testDoctor) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testType = testType;
		this.keyIndicators = keyIndicators;
		this.testDate = testDate;
		this.testOrderInfo = testOrderInfo;
		this.testDoctor = testDoctor;
	}
	/**
	 * @return the testId
	 */
	public int getTestId() {
		return testId;
	}
	/**
	 * @param testId the testId to set
	 */
	public void setTestId(int testId) {
		this.testId = testId;
	}
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return the testType
	 */
	public String getTestType() {
		return testType;
	}
	/**
	 * @param testType the testType to set
	 */
	public void setTestType(String testType) {
		this.testType = testType;
	}
	/**
	 * @return the keyIndicators
	 */
	public String getKeyIndicators() {
		return keyIndicators;
	}
	/**
	 * @param keyIndicators the keyIndicators to set
	 */
	public void setKeyIndicators(String keyIndicators) {
		this.keyIndicators = keyIndicators;
	}
	/**
	 * @return the testDate
	 */
	public String getTestDate() {
		return testDate;
	}
	/**
	 * @param testDate the testDate to set
	 */
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}
	/**
	 * @return the testOrderInfo
	 */
	public int getTestOrderInfo() {
		return testOrderInfo;
	}
	/**
	 * @param testOrderInfo the testOrderInfo to set
	 */
	public void setTestOrderInfo(int testOrderInfo) {
		this.testOrderInfo = testOrderInfo;
	}
	/**
	 * @return the testDoctor
	 */
	public String getTestDoctor() {
		return testDoctor;
	}
	/**
	 * @param testDoctor the testDoctor to set
	 */
	public void setTestDoctor(String testDoctor) {
		this.testDoctor = testDoctor;
	}
	
	

}
