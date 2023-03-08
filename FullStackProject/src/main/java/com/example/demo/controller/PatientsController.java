package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.PatientsDto;
import com.example.demo.model.Patients;

import com.example.demo.service.PatientService;
@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    PatientService patientService;
 
      @PostMapping(path = "/save")
    public String savePatients(@RequestBody PatientsDto patientsDto)
    {
    	String id = patientService.addPatient(patientsDto);
        return id;
        
    }
      @GetMapping("/get")
  	public List<Patients> get()
  	{
  		return patientService.getPatients();
  		
  	}
    @PutMapping("/put")
  	public String update(@RequestBody Patients patients)
  	{
  		return patientService.updatePatients(patients);
  	}
    @DeleteMapping("/del")
	public String delete(@RequestParam int id)
	{
	return patientService.deletepatientsById(id);
	}

  

}
