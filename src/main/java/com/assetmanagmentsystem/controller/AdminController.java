package com.assetmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.AdminBean;
import com.assetmanagmentsystem.service.AdminService;


@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
//	@RequestMapping(value = "/addadmin",method = RequestMethord.GET)

//	@PostMapping("/addAdmin")
//	public ResponseEntity<AdminBean>addAdmin(@RequestBody AdminBean adminBean)
//	{
//		adminService.addAdmin(adminBean);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView addAdmin(ModelAndView mv) {
		return mv;
	}
	//add Admin Data
	@RequestMapping(value = "/addAdminData", method = RequestMethod.GET)
	public ModelAndView addAdminData(ModelAndView mv, @ModelAttribute("adminBean") AdminBean adminBean) {
		adminService.addAdmin(adminBean);
		return mv;
	}
	@RequestMapping(value = "/addAdminTest", method = RequestMethod.GET)
	public ModelAndView OnlyTest(ModelAndView mv) {
		return mv;
	}

	//view Admin Data
	@RequestMapping(value = "/viewAdminData")
	public ModelAndView adminViewAll(ModelAndView mv, Model m) {
		List<AdminBean> adminBean = adminService.viewAllAdmin();
		m.addAttribute("AdminBean", adminBean);
		return mv;
	}
	//edit Admin Data
	@RequestMapping(value = "/editAdminData/{adminId}",method = RequestMethod.GET)
	public ModelAndView viewAdminById(@PathVariable("adminId")int adminId,ModelAndView mv,Model m)
	{
		mv = new ModelAndView("editAdminData");
		AdminBean adminBean = adminService.viewAdminById(adminId);
		m.addAttribute("AdminBean", adminBean);
		return mv;
	}
	@RequestMapping(value = "/editAdminData/editAdmin")
	public ModelAndView editAdmin(@ModelAttribute("adminBean")AdminBean adminBean,ModelAndView mv)
	{
		mv= new ModelAndView("editAdmin");
		adminService.editAdmin(adminBean);
		return mv;
	}
	//delete admin data
	@RequestMapping(value = "deleteAdmin/{adminId}")
	public ModelAndView deleteAdmin(@PathVariable("adminId")int adminId,ModelAndView mv)
	{
		mv = new ModelAndView("deleteAdmin");
		adminService.deleteAdmin(adminId);
		return mv;
	}

	@RequestMapping(value = "/login")
	public ModelAndView viewHomePage(ModelAndView mv) {
		String message = "Welcome To Krios";
		mv.addObject("message", message);
		return mv;
	}
	//dashboard
//	@RequestMapping(value = "/dashboard")
//	public ModelAndView viewDashBoard(ModelAndView mv) {
//		String message = "Welcome To Krios";
//		mv.addObject("message", message);
//		return mv;
//	}


//	@GetMapping("/viewAdminById/{adminId}")
//	public ResponseEntity<AdminBean> viewAdmin(@PathVariable(value = "adminId") int adminId) {
//		AdminBean adminBean = adminService.viewAdminById(adminId);
//		return new ResponseEntity<>(adminBean, HttpStatus.OK);
//	}
}
