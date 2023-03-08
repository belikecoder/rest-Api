package com.example.demo.model;

import jakarta.persistence.*;
@Entity
public class Patients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="patient_id", length = 45)
	private int id;
	 @Column(name="patient_name", length = 145)
	private  String patientName;
	 @Column(name="disease_name", length = 145)
	private String diseaseName;
	 @Column(name="patient_room_wardno", length = 145)
	private int wardNo;
	 @Column(name="patient_dob", length = 145)
	private String dateOfBirth;
	 @Column(name="patient_age", length = 100)
	private int age;
	 @Column(name="patient_phonenumber", length = 10)
	private long phoneNumber;
	 @Column(name="patient_address", length = 145)
	private String address;
	 @Column(name="patient_gender", length = 20)
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public int getWardNo() {
		return wardNo;
	}
	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Patients() {
		
	}
	public Patients(int id, String patientName, String diseaseName, int wardNo, String dateOfBirth, int age,
			long phoneNumber, String address, String gender) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.diseaseName = diseaseName;
		this.wardNo = wardNo;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", diseaseName=" + diseaseName + ", wardNo="
				+ wardNo + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", gender=" + gender + "]";
	}

}
