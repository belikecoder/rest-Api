package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;
@RestController
public class ApiControllers {
	@Autowired
	ApiService service;
	
	@PostMapping("/student")
	public String add(@RequestBody Student student)
	{
		return service.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> get()
	{
		return service.getStudent();
	}
	@PutMapping("/student")
	public String update(@RequestBody Student student)
	{
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/student")
		public String delete(@RequestParam int id)
		{
		return service.deleteStudentById(id);
		}
	


}
