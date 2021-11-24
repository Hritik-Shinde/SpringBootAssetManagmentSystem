package com.assetmanagmentsystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.bean.AdminBean;
import com.assetmanagmentsystem.mapper.AdminMapper;
import com.assetmanagmentsystem.model.Admin;
import com.assetmanagmentsystem.repositry.AdminRepositry;
import com.assetmanagmentsystem.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepositry adminRepositry;
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public void addAdmin(AdminBean adminBean) {
		// TODO Auto-generated method stub
		Admin admin = adminMapper.maptoEntity(adminBean);
		adminRepositry.save(admin);
	}

	@Override
	public AdminBean viewAdminById(int adminId) {
		// TODO Auto-generated method stub
		AdminBean response = null;
		//fetch from 
		Optional<Admin>adminOptional = adminRepositry.findById(adminId);
		if(adminOptional.isPresent())
		{
			Admin admin = adminOptional.get();
			response = adminMapper.maptoBean(admin);
		}
		return response;
	}

	@Override
	public List<AdminBean> viewAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editAdmin(AdminBean adminBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		
	}

}
