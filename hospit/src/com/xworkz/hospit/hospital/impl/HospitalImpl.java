package com.xworkz.hospit.hospital.impl;

import com.xworkz.hospit.dto.PatientDTO;
import com.xworkz.hospit.hospital.Hospital;

public class HospitalImpl implements Hospital{
	
	public PatientDTO patientDTO[];
	int index;
	
	public HospitalImpl(int size) {
		patientDTO=new PatientDTO[size];
	}

	@Override
	public boolean createPatientDetails(PatientDTO dto) {
		boolean patientAdded=false;
		
			if(dto != null) {
				patientDTO[index++]=dto;
				patientAdded=true;
				}
			else {
				System.out.println("no patient found");
			}
			
		return patientAdded;
	}

	@Override
	public void getAllPatientDetails() {
		for (int i = 0; i < patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
		}
		
	}
	
	

}
