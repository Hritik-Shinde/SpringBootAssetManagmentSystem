package com.assetmanagmentsystem.model;

import java.util.Objects;

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
	@Column(name = "assetId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetId;
	@Column(name = "typeOfAsset")
	private String typeOfAsset;
	@Column(name = "avaliablecount")
	private String avaliablecount;
	//vendero forign key
	int vendorId;
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getTypeOfAsset() {
		return typeOfAsset;
	}
	public void setTypeOfAsset(String typeOfAsset) {
		this.typeOfAsset = typeOfAsset;
	}
	public String getAvaliablecount() {
		return avaliablecount;
	}
	public void setAvaliablecount(String avaliablecount) {
		this.avaliablecount = avaliablecount;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", typeOfAsset=" + typeOfAsset + ", avaliablecount=" + avaliablecount
				+ ", vendorId=" + vendorId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(assetId, avaliablecount, typeOfAsset, vendorId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Asset))
			return false;
		Asset other = (Asset) obj;
		return assetId == other.assetId && Objects.equals(avaliablecount, other.avaliablecount)
				&& Objects.equals(typeOfAsset, other.typeOfAsset) && vendorId == other.vendorId;
	}
	



}
