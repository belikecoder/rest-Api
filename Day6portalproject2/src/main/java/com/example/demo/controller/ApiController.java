package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Chield;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/baby")
	public String add(@RequestBody Chield chield)
	{
		return service.addBaby(chield);
	}
	
	@GetMapping("/baby")
	public List<Chield> get()
	{
		return service.getBaby();
	}
	@GetMapping("/baby/{field}")
	public List<Chield> babyWithSort(@PathVariable String field)
	{
		return service.getBabySorted(field);
	}
	@GetMapping("/baby/{offset}/{pageSize}")
	public List<Chield> babyWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	{
		return service.getBabyWithPagination(offset, pageSize );
	}
	@GetMapping("/baby/{offset}/{pageSize}/{field}")
	public List<Chield> babyWithSortingAndPagination(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return service.getBabyWithSortingAndPagination(offset, pageSize,field );
	}
	


}
