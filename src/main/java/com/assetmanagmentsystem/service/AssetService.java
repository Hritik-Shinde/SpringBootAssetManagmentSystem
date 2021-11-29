package com.assetmanagmentsystem.service;

import com.assetmanagmentsystem.bean.AssetBean;


public interface AssetService {
	void addAsset(AssetBean assetBean);

	AssetBean viewAssetById(int empId);

	void deleteAsset(int assetId);
}
