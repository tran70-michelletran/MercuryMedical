/*
 * A Patient Javabean
 */

package com.mercurymedical.model;

import java.io.Serializable;

public class Patient implements Serializable{
	
	private String loginId;
	private int ohipNum;
	private int ohipVer;
	private String firstName;
	private String middleInt;
	private String lastName;
	private String gender;
	private String dob;
	
	
	public Patient() {
		super();
	}
	
	public Patient(String loginId, int ohipNum, int ohipVer, String firstName, String middleInt, String lastName,
			String gender, String dob) {
		super();
		this.loginId = loginId;
		this.ohipNum = ohipNum;
		this.ohipVer = ohipVer;
		this.firstName = firstName;
		this.middleInt = middleInt;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
	}


	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	public int getOhipNum() {
		return ohipNum;
	}


	public void setOhipNum(int ohipNum) {
		this.ohipNum = ohipNum;
	}


	public int getOhipVer() {
		return ohipVer;
	}


	public void setOhipVer(int ohipVer) {
		this.ohipVer = ohipVer;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleInt() {
		return middleInt;
	}


	public void setMiddleInt(String middleInt) {
		this.middleInt = middleInt;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	
}
