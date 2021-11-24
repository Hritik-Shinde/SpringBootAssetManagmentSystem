package com.assetmanagmentsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Asset")
public class Asset {
	@Id
	@Column(name="assetId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetId;
	@Column(name = "totalStock")
	private int totalStock;
	@Column(name="assignStock")
	private String assignStock;
	@Column(name="typeOfAsset")
	private String typeOfAsset;
	

	public int getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(int totalStock) {
		this.totalStock = totalStock;
	}

	public String getAssignStock() {
		return assignStock;
	}

	public void setAssignStock(String assignStock) {
		this.assignStock = assignStock;
	}

	public String getTypeofAsset() {
		return typeOfAsset;
	}

	public void setTypeofAsset(String typeofAsset) {
		this.typeOfAsset = typeofAsset;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	@Override
	public String toString() {
		return "Asset [totalStock=" + totalStock + ", assignStock=" + assignStock + ", typeofAsset=" + typeOfAsset
				+ ", assetId=" + assetId + "]";
	}

}
