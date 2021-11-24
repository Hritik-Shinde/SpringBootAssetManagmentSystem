package com.assetmanagmentsystem.bean;

import java.sql.Date;


public class StatusBean {
	private int empId;
	private String empName;
	private String assetName;
	private String status;
	private Date replaceDate;
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
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getReplaceDate() {
		return replaceDate;
	}
	public void setReplaceDate(Date replaceDate) {
		this.replaceDate = replaceDate;
	}
	@Override
	public String toString() {
		return "StatusBean [empId=" + empId + ", empName=" + empName + ", assetName=" + assetName + ", status=" + status
				+ ", replaceDate=" + replaceDate + "]";
	}
	
}
