package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
@Service
public class ApiService {
	@Autowired
	StudentRepo repository;
	public String addStudent(Student student) 
	{
		repository.save(student);
		return "Added";
	}
	public List<Student> getStudent()
	{
		return repository.findAll();
	}
	public String updateStudent(Student student)
	{
		repository.save(student);
		return "Updated";
	}
	public String deleteStudentById(int id) {
	    repository.deleteById(id);
	    return "Student Deleted";
	}

}
