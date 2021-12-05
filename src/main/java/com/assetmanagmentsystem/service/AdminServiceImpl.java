//package com.assetmanagmentsystem.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import com.assetmanagmentsystem.bean.AdminBean;
//import com.assetmanagmentsystem.mapper.AdminMapper;
//import com.assetmanagmentsystem.model.Admin;
//import com.assetmanagmentsystem.repositry.AdminRepositry;
//
//
//@Service
//public class AdminService
//	
//	@Autowired
//	private AdminRepositry adminRepositry;
//	
//	@Override
//	public void addAdmin(AdminBean adminBean) {
//		// TODO Auto-generated method stub
//		Admin admin = adminMapper.maptoEntity(adminBean);
//		adminRepositry.save(admin);
//	}
//
//	@Override
//	public AdminBean viewAdminById(int adminId) {
//		// TODO Auto-generated method stub
//		AdminBean response = null;
//		//fetch from 
//		Optional<Admin>adminOptional = adminRepositry.findById(adminId);
//		if(adminOptional.isPresent())
//		{
//			Admin admin = adminOptional.get();
//			response = adminMapper.maptoBean(admin);
//		}
//		return response;
//	}
//
//	@Override
//	public List<AdminBean> viewAllAdmin() {
//		// TODO Auto-generated method stub
//		List<AdminBean> adminBean = new ArrayList<>();
//		List<Admin> admin = adminRepositry.findAll();
//		if(CollectionUtils.isEmpty(admin))
//		{
//			admin.forEach(b -> adminBean.add(adminMapper.maptoBean(b)));
//		}
//		return adminBean;
//	}
//
//	@Override
//	public void editAdmin(AdminBean adminBean) {
//		// TODO Auto-generated method stub
//		Optional<Admin> adminOptional = adminRepositry.findById(adminBean.getAdminId());
//		if(adminOptional.isPresent())
//		{
//			Admin admin = adminOptional.get();
//			
//			
//			adminRepositry.save(admin);
//		}
//		
//	}
//
//	@Override
//	public void deleteAdmin(int adminId) {
//		// TODO Auto-generated method stub
//		Optional<Admin> plyareOptional = adminRepositry.findById(adminId);
//		if(plyareOptional.isPresent()) {
//			Admin admin = plyareOptional.get();
//			
//			adminRepositry.delete(admin);
//		}
//		
//	}
//
//	@Override
//	public Admin findByAdminNameAndPassword(String string, String string2) {
//		Admin admin= adminRepositry.findByUserIdAndPassword(string,string2);
//		System.out.println(admin);
//		return admin;
//	}
//
//
//
//	
//}
