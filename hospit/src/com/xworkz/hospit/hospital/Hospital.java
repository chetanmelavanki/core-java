package com.xworkz.hospit.hospital;

import com.xworkz.hospit.dto.PatientDTO;

public interface Hospital {
	
	public boolean createPatientDetails(PatientDTO dto) ;
	public void getAllPatientDetails();

}
