package com.mercurymedical.model;

import java.io.Serializable;

public class Appointment implements Serializable{

	private int apptNumber;
	private int patientId; // this is also the patient's loginId???
	private String reasonForVisit;
	private String date;
	private String time;
	private boolean isPatientCheckedIn;
	
	public Appointment() {
		super();
	}
	
	public Appointment(int apptNumber, int patientId, String reasonForVisit, String date, String time,
			boolean isPatientCheckedIn) {
		
		this.apptNumber = apptNumber;
		this.patientId = patientId;
		this.reasonForVisit = reasonForVisit;
		this.date = date;
		this.time = time;
		this.isPatientCheckedIn = isPatientCheckedIn;
	}


	public int getApptNumber() {
		return apptNumber;
	}


	public void setApptNumber(int apptNumber) {
		this.apptNumber = apptNumber;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getReasonForVisit() {
		return reasonForVisit;
	}


	public void setReasonForVisit(String reasonForVisit) {
		this.reasonForVisit = reasonForVisit;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public boolean isPatientCheckedIn() {
		return isPatientCheckedIn;
	}


	public void setPatientCheckedIn(boolean isPatientCheckedIn) {
		this.isPatientCheckedIn = isPatientCheckedIn;
	}
	
	
}
