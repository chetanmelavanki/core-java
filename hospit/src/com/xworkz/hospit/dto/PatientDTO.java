package com.xworkz.hospit.dto;

public class PatientDTO {
	private int patinetId;
	private String patientName;
	
	
	public int getPatinetId() {
		return patinetId;
	}
	public void setPatinetId(int patinetId) {
		this.patinetId = patinetId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	@Override
	public String toString() {
		return "PatientDTO [patinetId=" + patinetId + ", patientName=" + patientName + "]";
	}
	
	
	
	
}
