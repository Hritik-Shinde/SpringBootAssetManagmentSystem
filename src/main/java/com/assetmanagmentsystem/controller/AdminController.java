package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagmentsystem.bean.AdminBean;
import com.assetmanagmentsystem.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
//	@RequestMapping(value = "/addadmin",method = RequestMethord.GET)
	
	@PostMapping("/addAdmin")
	public ResponseEntity<AdminBean>addAdmin(@RequestBody AdminBean adminBean)
	{
		adminService.addAdmin(adminBean);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
//	@PostMapping("/editAdmin")
//	public ResponseEntity<AdminBean>editAdmin(@RequestBody AdminBean adminBean)
//	{
//		adminService.editAdmin(adminBean);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//	@DeleteMapping("/deleteAdmin/{adminId}")
//	public ResponseEntity<AdminBean>deleteAdmin(@PathVariable(value = "adminId")int adminId)
//	{
//		AdminBean adminBean = adminService.deleteAdmin(adminId);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//	@GetMapping("/viewAllAdmin")
//	public ResponseEntity<AdminBean>viewAllAdmin()
//	{
//		AdminBean adminBean = adminService.viewAllAdmin();
//		return new ResponseEntity<AdminBean>(adminBean,HttpStatus.OK);
//	}
	
	@GetMapping("/viewAdminById/{adminId}")
	public ResponseEntity<AdminBean>viewAdmin(@PathVariable(value = "adminId")int adminId)
	{
		AdminBean adminBean = adminService.viewAdminById(adminId);
		return new ResponseEntity<>(adminBean,HttpStatus.OK);
	}
	
}
