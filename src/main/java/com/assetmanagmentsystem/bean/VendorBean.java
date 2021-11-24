package com.assetmanagmentsystem.bean;

import java.sql.Date;

public class VendorBean {
	private String vendorName;
	private Date assetPurchaseDate;
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
		return "VendorBean [vendorName=" + vendorName + ", assetPurchaseDate=" + assetPurchaseDate + ", assetName="
				+ assetName + "]";
	}
	
}
