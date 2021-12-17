package com.assetmanagmentsystem.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author HritikShinde
 *
 */
@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	@Column(name = "ticketId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	//
	int empId;
	//
	int assetId;
	@Column(name = "status")
	private String status;
	@Column(name = "issueDesc")
	private String issueDesc;
	@Column(name = "ticketRaiseDate")
	private Date ticketRaiseDate;
	@Column(name = "dateModify")
	private Date dateModify;
	
	public String getIssueDesc() {
		return issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}
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
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getTicketRaiseDate() {
		return ticketRaiseDate;
	}
	public void setTicketRaiseDate(Date ticketRaiseDate) {
		this.ticketRaiseDate = ticketRaiseDate;
	}
	public Date getDateModify() {
		return dateModify;
	}
	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", empId=" + empId + ", assetId=" + assetId + ", status=" + status
				+ ", ticketRaiseDate=" + ticketRaiseDate + ", dateModify=" + dateModify + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(assetId, dateModify, empId, status, ticketId, ticketRaiseDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ticket))
			return false;
		Ticket other = (Ticket) obj;
		return assetId == other.assetId && Objects.equals(dateModify, other.dateModify) && empId == other.empId
				&& Objects.equals(status, other.status) && ticketId == other.ticketId
				&& Objects.equals(ticketRaiseDate, other.ticketRaiseDate);
	}

	



}
