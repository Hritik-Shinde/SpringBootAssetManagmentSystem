package com.assetmanagmentsystem.bean;

import java.sql.Date;
import java.util.Objects;

/**
 * 
 * @author swati / Hritik
 * date 22/11/21
 * 
 */
public class AssetBean {
	private int assetId;
	private String typeOfAsset;
	private String assetBrand;
	private String avaliablecount;
	private Date assetDate;
	public Date getAssetDate() {
		return assetDate;
	}
	public void setAssetDate(Date assetDate) {
		this.assetDate = assetDate;
	}
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
		return "AssetBean [assetId=" + assetId + ", typeOfAsset=" + typeOfAsset + ", avaliablecount=" + avaliablecount
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
		if (!(obj instanceof AssetBean))
			return false;
		AssetBean other = (AssetBean) obj;
		return assetId == other.assetId && Objects.equals(avaliablecount, other.avaliablecount)
				&& Objects.equals(typeOfAsset, other.typeOfAsset) && vendorId == other.vendorId;
	}
	public String getAssetBrand() {
		return assetBrand;
	}
	public void setAssetBrand(String assetBrand) {
		this.assetBrand = assetBrand;
	}

	
}
