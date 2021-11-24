package com.assetmanagmentsystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	@Column(name = "ticketId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	@Column(name = "empId")
	private int empId;
	@Column(name = "empName")
	private String empName;
	@Column(name = "assetName")
	private String assetName;
	@Column(name = "assetId")
	private int assetId;
	@Column(name = "ticketRaiseDate")
	private Date ticketRaiseDate;
	@Column(name = "issueRaise")
	private String issueRaise;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
		return "Ticket [ticketId=" + ticketId + ", empId=" + empId + ", empName=" + empName + ", assetName=" + assetName
				+ ", assetId=" + assetId + ", ticketRaiseDate=" + ticketRaiseDate + ", issueRaise=" + issueRaise + "]";
	}



}
