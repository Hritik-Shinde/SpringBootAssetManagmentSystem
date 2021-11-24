package com.assetmanagmentsystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Status")
public class Status {
	@Id
	@Column(name = "empId")
	private int empId;
	@Column(name ="empName")
	private String empName;
	@Column(name = "assetName")
	private String assetName;
	@Column(name = "status")
	private String status;
	@Column(name = "replaceDate")
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
		return "Status [empId=" + empId + ", empName=" + empName + ", assetName=" + assetName + ", status=" + status
				+ ", replaceDate=" + replaceDate + "]";
	}

}
