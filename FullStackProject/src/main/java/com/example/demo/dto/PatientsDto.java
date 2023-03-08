package com.example.demo.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PatientsDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String patientName;
    private String diseaseName;
    private int wardNo;
    private String dateOfBirth;
    private int age;
	private long phoneNumber;
	private String address;
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
	public PatientsDto() {
		
	}
	public PatientsDto(int id, String patientName, String diseaseName, int wardNo, String dateOfBirth, int age,
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
		return "PatientsDto [id=" + id + ", patientName=" + patientName + ", diseaseName=" + diseaseName + ", wardNo="
				+ wardNo + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	

}
