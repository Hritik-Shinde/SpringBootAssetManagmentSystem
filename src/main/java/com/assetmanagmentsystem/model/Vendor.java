package com.assetmanagmentsystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Vendor")
public class Vendor {
	@Id
	@Column(name = "vendorName")
	private String vendorName;
	@Column(name ="assetPurchaseDate")
	private Date assetPurchaseDate;
	@Column(name = "assetName")
	private String assetName;
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Date getAssetPurchaseDate() {
		return assetPurchaseDate;
	}
	public void setAssetPurchaseDate(Date assetPurchaseDate) {
		this.assetPurchaseDate = assetPurchaseDate;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	@Override
	public String toString() {
		return "Vendor [vendorName=" + vendorName + ", assetPurchaseDate=" + assetPurchaseDate + ", assetName="
				+ assetName + "]";
	} 
}
