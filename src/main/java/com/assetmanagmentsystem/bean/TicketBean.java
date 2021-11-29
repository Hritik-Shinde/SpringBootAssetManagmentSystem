package com.assetmanagmentsystem.bean;

import java.sql.Date;
import java.util.Objects;


public class TicketBean {
	private int ticketId;
	int empId;
	int assetId;
	private String status;
	private Date ticketRaiseDate;
	private Date dateModify;
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
		return "TicketBean [ticketId=" + ticketId + ", empId=" + empId + ", assetId=" + assetId + ", status=" + status
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
		if (!(obj instanceof TicketBean))
			return false;
		TicketBean other = (TicketBean) obj;
		return assetId == other.assetId && Objects.equals(dateModify, other.dateModify) && empId == other.empId
				&& Objects.equals(status, other.status) && ticketId == other.ticketId
				&& Objects.equals(ticketRaiseDate, other.ticketRaiseDate);
	}
	
	

}
