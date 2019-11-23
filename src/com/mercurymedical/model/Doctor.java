package com.mercurymedical.model;

import java.io.Serializable;

public class Doctor implements Serializable{
	
	private int cpso; // connects to the doctorId for visit
	private String firstName;
	private String lastName;
	private String loginId;
	private int primaryPracticeAdd; // can be removed if not used
	
	public Doctor() {
		super();
	}
	
	public Doctor(int cpso, String firstName, String lastName, String loginId, int primaryPracticeAdd) {
		this.cpso = cpso;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginId = loginId;
	}

	public int getCpso() {
		return cpso;
	}

	public void setCpso(int cpso) {
		this.cpso = cpso;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return the primaryPracticeAdd
	 */
	public int getPrimaryPracticeAdd() {
		return primaryPracticeAdd;
	}

	/**
	 * @param primaryPracticeAdd the primaryPracticeAdd to set
	 */
	public void setPrimaryPracticeAdd(int primaryPracticeAdd) {
		this.primaryPracticeAdd = primaryPracticeAdd;
	}
}
