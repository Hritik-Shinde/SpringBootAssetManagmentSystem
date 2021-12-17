package com.assetmanagmentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.repositry.AssetRepositry;
/**
 * 
 * @author HritikShinde
 *
 */
@Service
public class AssetService {

	@Autowired
	private AssetRepositry assetRepositry;
	public Asset addEmployee(Asset asset) {
		return assetRepositry.save(asset);
		
		
	}
	public List<Asset> getAllAssets() {
		return assetRepositry.findAll();
	}
	public Boolean deleteasset(int assetId) {
		// TODO Auto-generated method stub
		assetRepositry.deleteById(assetId);
		return true;
	
	}
	public Asset getAssetById(Integer assetId) {
		Asset asset = assetRepositry.getById(assetId);
		return asset;
	}
	
	public Asset updateAsset(int assetId, Asset asset)
	{
		return assetRepositry.save(asset);
	}
	
}
