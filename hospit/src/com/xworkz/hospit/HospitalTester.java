package com.xworkz.hospit;

import java.util.Scanner;

import com.xworkz.hospit.dto.PatientDTO;
import com.xworkz.hospit.hospital.Hospital;
import com.xworkz.hospit.hospital.impl.HospitalImpl;

public class HospitalTester {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size");
		int size=scanner.nextInt();
	
	Hospital hospital=new HospitalImpl(size);
	for (int i = 0; i < size; i++) {
		
	
	PatientDTO dto=new PatientDTO();
	
	System.out.println("enter id");
	dto.setPatinetId(scanner.nextInt());
	
	System.out.println("enter a name");
	dto.setPatientName(scanner.next());
	
	System.out.println(hospital.createPatientDetails(dto));
	}
	
	System.out.println("getting all details");
	hospital.getAllPatientDetails();
	}
	
}