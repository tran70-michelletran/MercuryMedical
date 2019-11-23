package com.mercurymedical.model;

import java.io.Serializable;

public class PhoneNumber implements Serializable {
	
	private int phoneNum;
	private String phoneType;
	private String userName;
	
	/**
	 * 
	 */
	public PhoneNumber() {
		super();
	}
	
	/**
	 * @param phoneNum
	 * @param phoneType
	 * @param userName
	 */
	public PhoneNumber(int phoneNum, String phoneType, String userName) {
		super();
		this.phoneNum = phoneNum;
		this.phoneType = phoneType;
		this.userName = userName;
	}

	/**
	 * @return the phoneNum
	 */
	public int getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the phoneType
	 */
	public String getPhoneType() {
		return phoneType;
	}

	/**
	 * @param phoneType the phoneType to set
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
