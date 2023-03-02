package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class ApiService {
	@Autowired
	EmployeeRepo repository;
	public String addEmployee(Employee employee) 
	{
		repository.save(employee);
		return "Added";
	}
	public List<Employee> getEmployee()
	{
		return repository.findAll();
	}
}
