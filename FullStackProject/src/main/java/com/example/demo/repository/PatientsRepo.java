package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.PatientsDto;
import com.example.demo.model.Patients;
@EnableJpaRepositories
@Repository
public interface PatientsRepo extends JpaRepository<Patients ,Integer>{

}
