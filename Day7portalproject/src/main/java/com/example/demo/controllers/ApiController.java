package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/car")
	public String add(@RequestBody Car car)
	{
		return service.addCar(car);
	}
	
	@GetMapping("/car")
	public List<Car> get()
	{
		return service.getCar();
	}
	@DeleteMapping("/car")
		public String delete(@RequestParam int id)
		{
		return service.deleteCarById(id);
		}
	@GetMapping("/ownners/{ownners}")
	public List<Car> getByOwners(@PathVariable int ownners){
		return service.getCarByOwners(ownners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable String address){
		return service.getCarByAddress(address);
	}
	
	@GetMapping("/carname/{carName}")
	public List<Car> getByCarName(@PathVariable String carName){
		return service.getCarByCarName(carName);
	}
	
	@GetMapping("/ownners/{ownners}/cartype/{carType}")
	public List<Car> getByOwnersAndCarType(@PathVariable int ownners,@PathVariable String carType){
		return service.getCarByOwnersAndCarType(ownners, carType);
	}
	

	
}
