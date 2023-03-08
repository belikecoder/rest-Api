package com.example.demo.service; 



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientsDto;

import com.example.demo.model.Patients;
import com.example.demo.repository.PatientsRepo;
@Service
public class PatientServicelmpl implements  PatientService{
	 @Autowired
	    private PatientsRepo patientsRepo;
	    @Override
	    public String addPatient(PatientsDto patientsDto)
	       {
	 
	        Patients patients = new Patients(
	                patientsDto.getId(),
	                patientsDto.getPatientName(),
	                patientsDto.getDiseaseName(),
	                patientsDto.getWardNo(),
	                patientsDto.getDateOfBirth(),
	                patientsDto.getAge(),
	                patientsDto.getPhoneNumber(),
	                patientsDto.getAddress(),
	                patientsDto.getGender()
	                
	        );
	        patientsRepo.save(patients);
	        return patients.getPatientName();
	    }
	    public List<Patients> getPatients()
		{
			return patientsRepo.findAll();
		}
		public String updatePatients(Patients patients) {
	    patientsRepo.save(patients);
			return "Updated";
		}
	
		@Override
		public String deletepatientsById(int id) {
        patientsRepo.deleteById(id);
        return "deleted";
		}

}
