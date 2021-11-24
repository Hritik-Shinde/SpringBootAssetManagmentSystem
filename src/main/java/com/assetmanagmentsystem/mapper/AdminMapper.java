package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.AdminBean;
import com.assetmanagmentsystem.model.Admin;

@Component
public class AdminMapper {

	public AdminBean maptoBean(Admin admin) {
		AdminBean bean = new AdminBean();
		bean.setAdminId(admin.getAdminId());
		bean.setAdminName(admin.getAdminName());
		bean.setPassword(admin.getPassword());
		bean.setUserId(admin.getUserId());
		return bean;

	}

	public Admin maptoEntity(AdminBean adminBean) {
		Admin admin = new Admin();
		admin.setAdminId(adminBean.getAdminId());
		admin.setAdminName(adminBean.getAdminName());
		admin.setUserId(adminBean.getUserId());
		admin.setPassword(adminBean.getPassword());
		return admin;
	}
}
