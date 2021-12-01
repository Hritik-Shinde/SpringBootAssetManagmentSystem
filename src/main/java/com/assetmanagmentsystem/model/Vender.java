package com.assetmanagmentsystem.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Vender")
public class Vender {
	@Id
	@Column(name = "venderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venderId;
	@Column(name = "venderMobileNo")
	private int venderMobileNo;
	@Column(name = "venderName")
	private String venderName;
	@Column(name = "venderLastName")
	private String venderLastName;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "venderemailId")
	private String venderemailId;
	@Column(name = "dateCreated")
	private Date dateCreated;
	@Column(name = "modifyDate")
	private Date modifyDate;
	@Column(name = "venderStatus")
	private String venderStatus;
	public String getVenderStatus() {
		return venderStatus;
	}
	public void setVenderStatus(String venderStatus) {
		this.venderStatus = venderStatus;
	}
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
	@Override
	public String toString() {
		return "Vender [venderId=" + venderId + ", venderMobileNo=" + venderMobileNo + ", venderName=" + venderName
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
		if (!(obj instanceof Vender))
			return false;
		Vender other = (Vender) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && Objects.equals(dateCreated, other.dateCreated)
				&& Objects.equals(modifyDate, other.modifyDate) && Objects.equals(state, other.state)
				&& venderId == other.venderId && Objects.equals(venderLastName, other.venderLastName)
				&& venderMobileNo == other.venderMobileNo && Objects.equals(venderName, other.venderName)
				&& Objects.equals(venderStatus, other.venderStatus)
				&& Objects.equals(venderemailId, other.venderemailId);
	}

	
	
}
