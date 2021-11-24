package com.assetmanagmentsystem.bean;


public class AssetBean {
	private int assetId;
	private int totalStock;
	private String assignStock;
	private String typeOfAsset;
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
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
	public String getTypeOfAsset() {
		return typeOfAsset;
	}
	public void setTypeOfAsset(String typeOfAsset) {
		this.typeOfAsset = typeOfAsset;
	}
	@Override
	public String toString() {
		return "AssetBean [assetId=" + assetId + ", totalStock=" + totalStock + ", assignStock=" + assignStock
				+ ", typeOfAsset=" + typeOfAsset + "]";
	}
	
}
