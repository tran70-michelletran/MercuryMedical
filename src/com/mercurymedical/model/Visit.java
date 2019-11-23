package com.mercurymedical.model;

import java.io.Serializable;

public class Visit implements Serializable{
	
	private int apptNum;
	private int visitNumber;
	private int doctorId;
	private String dateTimeOfVisit;
	private int bpSys;
	private double temp;
	private int bpDia;
	private String medicalDiag;
	private String docNotes;
	private boolean isVisitComplete;
	
	public Visit() {
		super();
	}
	
	public Visit(int apptNum, int visitNumber, int doctorId, String dateTimeOfVisit, int bpSys, double temp, int bpDia,
			String medicalDiag, String docNotes, boolean isVisitComplete) {
		super();
		this.apptNum = apptNum;
		this.visitNumber = visitNumber;
		this.doctorId = doctorId;
		this.dateTimeOfVisit = dateTimeOfVisit;
		this.bpSys = bpSys;
		this.temp = temp;
		this.bpDia = bpDia;
		this.medicalDiag = medicalDiag;
		this.docNotes = docNotes;
		this.isVisitComplete = isVisitComplete;
	}


	public int getApptNum() {
		return apptNum;
	}


	public void setApptNum(int apptNum) {
		this.apptNum = apptNum;
	}


	public int getVisitNumber() {
		return visitNumber;
	}


	public void setVisitNumber(int visitNumber) {
		this.visitNumber = visitNumber;
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDateTimeOfVisit() {
		return dateTimeOfVisit;
	}


	public void setDateTimeOfVisit(String dateTimeOfVisit) {
		this.dateTimeOfVisit = dateTimeOfVisit;
	}


	public int getBpSys() {
		return bpSys;
	}


	public void setBpSys(int bpSys) {
		this.bpSys = bpSys;
	}


	public double getTemp() {
		return temp;
	}


	public void setTemp(double temp) {
		this.temp = temp;
	}


	public int getBpDia() {
		return bpDia;
	}


	public void setBpDia(int bpDia) {
		this.bpDia = bpDia;
	}


	public String getMedicalDiag() {
		return medicalDiag;
	}


	public void setMedicalDiag(String medicalDiag) {
		this.medicalDiag = medicalDiag;
	}


	public String getDocNotes() {
		return docNotes;
	}


	public void setDocNotes(String docNotes) {
		this.docNotes = docNotes;
	}


	public boolean isVisitComplete() {
		return isVisitComplete;
	}


	public void setVisitComplete(boolean isVisitComplete) {
		this.isVisitComplete = isVisitComplete;
	}

}
