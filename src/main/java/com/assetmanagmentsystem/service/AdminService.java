package com.assetmanagmentsystem.service;

import java.util.List;

import com.assetmanagmentsystem.bean.AdminBean;
import com.assetmanagmentsystem.model.Admin;

public interface AdminService {
	void addAdmin(AdminBean adminBean);

	AdminBean viewAdminById(int adminId);

	List<AdminBean> viewAllAdmin();

	void editAdmin(AdminBean adminBean);
	
	void deleteAdmin(int adminId);

	Admin findByAdminNameAndPassword(String string, String string2);

}
