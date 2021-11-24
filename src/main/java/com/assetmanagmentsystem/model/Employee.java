package com.assetmanagmentsystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(name = "empId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "empName")
	private String empName;
	@Column(name = "deptName")
	private String deptName;
	@Column(name = "replaceAsset")
	private String replaceAsset;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "joiningDate")
	private Date joiningDate;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getReplaceAsset() {
		return replaceAsset;
	}
	public void setReplaceAsset(String replaceAsset) {
		this.replaceAsset = replaceAsset;
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", replaceAsset="
				+ replaceAsset + ", emailId=" + emailId + ", password=" + password + ", joiningDate=" + joiningDate
				+ "]";
	}

	
}
