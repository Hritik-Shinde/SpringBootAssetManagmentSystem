package com.assetmanagmentsystem.service;

import com.assetmanagmentsystem.bean.AssetBean;
import com.assetmanagmentsystem.model.Asset;


public interface AssetService {
	String addAsset(Asset asset);

	AssetBean viewAssetById(int empId);

	void deleteAsset(int assetId);
}
