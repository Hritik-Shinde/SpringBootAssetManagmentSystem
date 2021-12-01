package com.assetmanagmentsystem.mapper;

import javax.management.relation.Role;

import com.assetmanagmentsystem.bean.AssetBean;
import com.assetmanagmentsystem.bean.RoleMasterBean;
import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.RoleMaster;

public class RoleMasterMapper {
	
		public RoleMasterBean maptoBean(RoleMaster role) {
			RoleMasterBean bean = new RoleMasterBean();
			bean.setRollId(role.getRollId());
			bean.setName(role.getName());
			return bean;

		}

		public Asset maptoEntity(AssetBean assetBean) {
			Asset asset = new Asset();
			asset.setAssetId(assetBean.getAssetId());
			asset.setTypeOfAsset(assetBean.getTypeOfAsset());
			asset.setAvaliablecount(assetBean.getAvaliablecount());
			return asset;
		}
}
