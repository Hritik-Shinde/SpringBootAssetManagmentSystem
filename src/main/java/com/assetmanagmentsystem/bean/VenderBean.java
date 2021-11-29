package com.assetmanagmentsystem.bean;

import java.sql.Date;
import java.util.Objects;

public class VenderBean {
	private int venderId;
	private int venderMobileNo;
	private String venderName;
	private String venderLastName;
	private String country;
	private String state;
	private String city;
	private String address;
	private String venderemailId;
	private Date dateCreated;
	private Date modifyDate;
	private String venderStatus;
	public int getVenderId() {
		return venderId;
	}
	public void setVenderId(int venderId) {
		this.venderId = venderId;
	}
	public int getVenderMobileNo() {
		return venderMobileNo;
	}
	public void setVenderMobileNo(int venderMobileNo) {
		this.venderMobileNo = venderMobileNo;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public String getVenderLastName() {
		return venderLastName;
	}
	public void setVenderLastName(String venderLastName) {
		this.venderLastName = venderLastName;
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
	public String getVenderemailId() {
		return venderemailId;
	}
	public void setVenderemailId(String venderemailId) {
		this.venderemailId = venderemailId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getVenderStatus() {
		return venderStatus;
	}
	public void setVenderStatus(String venderStatus) {
		this.venderStatus = venderStatus;
	}
	@Override
	public String toString() {
		return "VenderBean [venderId=" + venderId + ", venderMobileNo=" + venderMobileNo + ", venderName=" + venderName
				+ ", venderLastName=" + venderLastName + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", address=" + address + ", venderemailId=" + venderemailId + ", dateCreated=" + dateCreated
				+ ", modifyDate=" + modifyDate + ", venderStatus=" + venderStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, city, country, dateCreated, modifyDate, state, venderId, venderLastName,
				venderMobileNo, venderName, venderStatus, venderemailId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VenderBean))
			return false;
		VenderBean other = (VenderBean) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && Objects.equals(dateCreated, other.dateCreated)
				&& Objects.equals(modifyDate, other.modifyDate) && Objects.equals(state, other.state)
				&& venderId == other.venderId && Objects.equals(venderLastName, other.venderLastName)
				&& venderMobileNo == other.venderMobileNo && Objects.equals(venderName, other.venderName)
				&& Objects.equals(venderStatus, other.venderStatus)
				&& Objects.equals(venderemailId, other.venderemailId);
	}
	
	
}
