package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PatientsDto;
import com.example.demo.model.Patients;


public interface PatientService {
	String addPatient(PatientsDto patientsDto) ;

	List<Patients> getPatients();

	

	String updatePatients(Patients patients);

	String deletepatientsById(int id);


	
		
	

}
