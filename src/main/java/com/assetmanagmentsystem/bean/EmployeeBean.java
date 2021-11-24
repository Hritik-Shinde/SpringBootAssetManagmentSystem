package com.assetmanagmentsystem.bean;

import java.sql.Date;


public class EmployeeBean {
	private int empId;
	private String empName;
	private String deptName;
	private String replaceAsset;
	private String emailId;
	private String password;
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
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", replaceAsset="
				+ replaceAsset + ", emailId=" + emailId + ", password=" + password + ", joiningDate=" + joiningDate
				+ "]";
	}
	
}
