package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.AssetBean;
import com.assetmanagmentsystem.model.Asset;

@Component
public class AssetMapper {
	public AssetBean maptoBean(Asset asset) {
		AssetBean bean = new AssetBean();
		bean.setAssetId(asset.getAssetId());
		bean.setTypeOfAsset(asset.getTypeOfAsset());
		bean.setAvaliablecount(asset.getAvaliablecount());
		bean.setAssetBrand(asset.getAssetBrand());
		bean.setAssetDate(asset.getAssetDate());
		return bean;

	}

	public Asset maptoEntity(AssetBean assetBean) {
		Asset asset = new Asset();
		asset.setAssetId(assetBean.getAssetId());
		asset.setTypeOfAsset(assetBean.getTypeOfAsset());
		asset.setAvaliablecount(assetBean.getAvaliablecount());
		asset.setAssetBrand(assetBean.getAssetBrand());
		asset.setAssetDate(assetBean.getAssetDate());
		asset.setAssetDate(assetBean.getAssetDate());
		return asset;
	}
	
}
