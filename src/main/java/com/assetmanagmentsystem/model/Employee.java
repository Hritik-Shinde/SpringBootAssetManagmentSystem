package com.assetmanagmentsystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.Assert;
@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(name = "empId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "empName")
	private String empName;
	@Column(name = "empLastName")
	private String empLastName;
	@Column(name = "mobileNo")
	private long mobileNo;
//	@Column(name = "materialStatus")
//	private String materialStatus;
	@Column(name = "dateOBPlace")
	private String dateOBPlace;
	@Column(name = "bloodGroup")
	private String bloodGroup;
	@Column(name = "department")
	private String department;
	@Column(name = "gender")
	private String gender;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "dateOB")
	private String dateOB;
	@Column(name = "joiningDate")
	private Date joiningDate;
	@Column(name = "role")
	private String role;
	@Column(name = "asset")
	private String asset;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
//	public String getMaterialStatus() {
//		return materialStatus;
//	}
//	public void setMaterialStatus(String materialStatus) {
//		this.materialStatus = materialStatus;
//	}
	public String getDateOBPlace() {
		return dateOBPlace;
	}
	public void setDateOBPlace(String dateOBPlace) {
		this.dateOBPlace = dateOBPlace;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOB() {
		return dateOB;
	}
	public void setDateOB(String dateOB) {
		this.dateOB = dateOB;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLastName=" + empLastName + ", mobileNo="
				+ mobileNo + ", dateOBPlace=" + dateOBPlace + ", bloodGroup="
				+ bloodGroup + ", department=" + department + ", gender=" + gender + ", country=" + country + ", state="
				+ state + ", city=" + city + ", address=" + address + ", emailId=" + emailId + ", password=" + password
				+ ", dateOB=" + dateOB + ", joiningDate=" + joiningDate + "]";
	}
	
		
}
