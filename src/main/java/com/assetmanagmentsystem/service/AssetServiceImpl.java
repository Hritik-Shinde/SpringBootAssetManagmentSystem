//package com.assetmanagmentsystem.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.CollectionUtils;
//import org.springframework.stereotype.Service;
//
//import com.assetmanagmentsystem.bean.AssetBean;
//import com.assetmanagmentsystem.bean.EmployeeBean;
//import com.assetmanagmentsystem.mapper.AssetMapper;
//import com.assetmanagmentsystem.model.Asset;
//import com.assetmanagmentsystem.model.Employee;
//import com.assetmanagmentsystem.model.Vender;
//import com.assetmanagmentsystem.repositry.AssetRepositry;
//import com.assetmanagmentsystem.repositry.VenderRepositry;
//import com.assetmanagmentsystem.service.AssetService;
//
//
//@Service
//public class AssetServiceImpl implements AssetService{
//	
//	@Autowired
//	private AssetRepositry assetRepositry;
//	@Autowired
//	private AssetMapper assetMapper;
//	@Override
//	public String addAsset(Asset asset) {
//		// TODO Auto-generated method stub
//		assetRepositry.save(asset);
//		return "sucess";
//		
//	}
//	@Override
//	public AssetBean viewAssetById(int assetId) {
//		// TODO Auto-generated method stub
//		AssetBean response = null;
//		//fetch from 
//		Optional<Asset>assetOptional = assetRepositry.findById(assetId);
//		if(assetOptional.isPresent())
//		{
//			Asset asset = assetOptional.get();
//			response = assetMapper.maptoBean(asset);
//		}
//		return response;
//		
//	}
//
//	@Override
//	public void deleteAsset(int assetId) {
//		// TODO Auto-generated method stub
//		Optional<Asset> assetOptional = assetRepositry.findById(assetId);
//		if(assetOptional.isPresent()) {
//			Asset asset = assetOptional.get();
//			
//			assetRepositry.delete(asset);
//		}
//		
//	}
//	@Override
//	public List<AssetBean> viewAllAsset() {
//		// TODO Auto-generated method stub
//		List<AssetBean> assetBean = new ArrayList<>();
//		List<Asset> asset = assetRepositry.findAll();
//		if(!CollectionUtils.isEmpty(asset))
//		{
//			asset.forEach(b -> assetBean.add(assetMapper.maptoBean(b)));
//		}
//		return assetBean;
//	}
//	@Override
//	public Asset getAssetById(int id) {
//		// TODO Auto-generated method stub
//		Asset asset = assetRepositry.getById(id);
//		return asset;
//	}
//	@Override
//	public void updateAsset(int id, AssetBean assetBean) {
//		// TODO Auto-generated method stub
//		Optional<Asset> assetOptional = assetRepositry.findById(id);
//		if(assetOptional.isPresent()) {
//			Asset asset = assetOptional.get();
//			asset.setTypeOfAsset(assetBean.getTypeOfAsset());
//			asset.setAssetBrand(assetBean.getAssetBrand());
//			asset.setAssetDate(assetBean.getAssetDate());
//			asset.setAvaliablecount(assetBean.getAvaliablecount());
//			assetRepositry.save(asset);
//		
//	}
//	
//	}	
//}
//	
//	
//	
//
