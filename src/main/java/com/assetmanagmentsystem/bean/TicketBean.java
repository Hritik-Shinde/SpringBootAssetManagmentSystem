package com.assetmanagmentsystem.bean;

import java.sql.Date;


public class TicketBean {
	private int ticketId;
	private int empId;
	private String empName;
	private String assetName;
	private int assetId;
	private Date ticketRaiseDate;
	private String issueRaise;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public Date getTicketRaiseDate() {
		return ticketRaiseDate;
	}
	public void setTicketRaiseDate(Date ticketRaiseDate) {
		this.ticketRaiseDate = ticketRaiseDate;
	}
	public String getIssueRaise() {
		return issueRaise;
	}
	public void setIssueRaise(String issueRaise) {
		this.issueRaise = issueRaise;
	}
	@Override
	public String toString() {
		return "TicketBean [ticketId=" + ticketId + ", empId=" + empId + ", empName=" + empName + ", assetName="
				+ assetName + ", assetId=" + assetId + ", ticketRaiseDate=" + ticketRaiseDate + ", issueRaise="
				+ issueRaise + "]";
	}
	

}
