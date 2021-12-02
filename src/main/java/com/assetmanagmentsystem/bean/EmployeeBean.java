package com.assetmanagmentsystem.bean;

import java.sql.Date;

/**
 * 
 * @author swati / Hritik
 * date 22/11/21
 *
 */

public class EmployeeBean {
	private int empId;
	private long mobileNo;
	private String empName;
	private String empLastName;
//	private String materialStatus;
	private String dateOBPlace;
	private String bloodGroup;
	private String department;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String address;
	private String emailId;
	private String password;
	private String dateOB; 
	private Date joiningDate;
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
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
	public String getDateOB() {
		return dateOB;
	}
	public void setDateOB(String dateOB) {
		this.dateOB = dateOB;
	}
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
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", mobileNo=" + mobileNo + ", empName=" + empName + ", empLastName="
				+ empLastName + ", dateOBPlace=" + dateOBPlace + ", bloodGroup="
				+ bloodGroup + ", department=" + department + ", gender=" + gender + ", country=" + country + ", state="
				+ state + ", city=" + city + ", address=" + address + ", emailId=" + emailId + ", password=" + password
				+ ", dateOB=" + dateOB + ", joiningDate=" + joiningDate + "]";
	}
	
	
}
