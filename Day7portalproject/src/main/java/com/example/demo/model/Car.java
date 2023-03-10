package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Car {
	@Id
	private int id;
	
	public Car() {
		super();
	}
	public Car(int id, String carName, String carType, int ownners, String currentOwnerName, long mobile,
			String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carType = carType;
		this.ownners = ownners;
		this.currentOwnerName = currentOwnerName;
		this.mobile = mobile;
		this.address = address;
	}
	private String carName;
	private String carType;
	private int ownners;
	private String currentOwnerName;
	private long mobile;
	private String address ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getOwnners() {
		return ownners;
	}
	public void setOwnners(int ownners) {
		this.ownners = ownners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", carName=" + carName + ", carType=" + carType + ", ownners=" + ownners
				+ ", currentOwnerName=" + currentOwnerName + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	

}
