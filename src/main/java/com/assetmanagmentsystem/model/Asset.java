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
 * @author HritikShinde/swati
 *
 */
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
	
	@Column(name = "assetBrand")
	private String assetBrand;
	
	@Column(name="assetexpiredate")
	private Date assetDate;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empId")
	private int empId;
	
	@Column(name="kriosProductId")
	private String kriosProductId;
	
	@Column(name="productId")
	private String productId;
	
	public String getKriosProductId() {
		return kriosProductId;
	}
	public void setKriosProductId(String kriosProductId) {
		this.kriosProductId = kriosProductId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Date getAssetDate() {
		return assetDate;
	}
	public void setAssetDate(Date assetDate) {
		this.assetDate = assetDate;
	}
	//vendero forign key
	int vendorId;
	public String getAssetBrand() {
		return assetBrand;
	}
	public void setAssetBrand(String assetBrand) {
		this.assetBrand = assetBrand;
	}
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

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	



}
