package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;
@Service
public class ApiService {
	@Autowired
	CarRepo repository;
	public String addCar(Car car) 
	{
		repository.save(car);
		return "Car is Added";
	}
	public List<Car> getCar()
	{
		return repository.findAll();
	}
	
	public String updateCar(Car car)
	{
		repository.save(car);
		return " Car is Updated ";
	}
	public String deleteCarById(int id) {
	    repository.deleteById(id);
	    return "Car is Removed";
	}
	public boolean Car(Car car){
		repository.save(car);
		return true;
	}
	
	public List<Car> getCarByOwners(int ownners){
		return repository.findByOwnners(ownners);
	}
	
	public List<Car> getCarByCarName(String carName){
		return repository.findByCarName(carName);
	}
	
	public List<Car> getCarByAddress(String address){
		return repository.findByAddress(address);
	}
	
	public List<Car> getCarByOwnersAndCarType(int ownners,String carType){
		return repository.findByOwnnersAndCarType(ownners, carType);
	}
}
	


