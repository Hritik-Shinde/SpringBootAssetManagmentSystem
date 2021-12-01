package com.assetmanagmentsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.bean.AssetBean;
import com.assetmanagmentsystem.mapper.AssetMapper;
import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.repositry.AssetRepositry;

import com.assetmanagmentsystem.service.AssetService;


@Service
public class AssetServiceImpl implements AssetService{
	
	@Autowired
	private AssetRepositry assetRepositry;
	@Autowired
	private AssetMapper assetMapper;
	@Override
	public String addAsset(Asset asset) {
		// TODO Auto-generated method stub
		assetRepositry.save(asset);
		return "sucess";
		
	}
	@Override
	public AssetBean viewAssetById(int assetId) {
		// TODO Auto-generated method stub
		AssetBean response = null;
		//fetch from 
		Optional<Asset>assetOptional = assetRepositry.findById(assetId);
		if(assetOptional.isPresent())
		{
			Asset asset = assetOptional.get();
			response = assetMapper.maptoBean(asset);
		}
		return response;
		
	}

	@Override
	public void deleteAsset(int assetId) {
		// TODO Auto-generated method stub
		Optional<Asset> assetOptional = assetRepositry.findById(assetId);
		if(assetOptional.isPresent()) {
			Asset asset = assetOptional.get();
			
			assetRepositry.delete(asset);
		}
		
	}
	
	
	
	
	
}
