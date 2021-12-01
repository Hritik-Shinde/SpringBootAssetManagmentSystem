package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Admin;
import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.model.Vender;
import com.assetmanagmentsystem.service.AdminService;
import com.assetmanagmentsystem.service.EmployeeService;

/**
 * 
 * @author swati / Hritik
 * date 22/11/21
 * login mapping 
 * dashboard mapping 
 * employee //temporary
 */

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("/")
    public ModelAndView login()
	 {
		  ModelAndView mav = new ModelAndView("login");
		  mav.addObject("admin", new Admin());
		  return mav; 
	 }
	//dashboard
	@PostMapping(value = "/dashboard")
	public ModelAndView viewDashBoard(@ModelAttribute("admin") Admin admin) {
		Admin admin2=adminService.findByAdminNameAndPassword(admin.getAdminName(),admin.getPassword());
		if(admin2==null) {
			 ModelAndView mav = new ModelAndView("error");
			 return mav;
		}else {
			 ModelAndView mav = new ModelAndView("dashboard");
			 return mav;
		}
		
	}
	@RequestMapping(value = "/employeeregestrationform")
	public ModelAndView employeeRegestration(ModelAndView mv ,Model m) {
		m.addAttribute("command", new Employee());
		return mv;
	}
	@RequestMapping(value = "/vendorregestrationform")
	public ModelAndView venderRegestration(ModelAndView mv ,Model m) {
		m.addAttribute("command", new Vender());
		return mv;
	}
	
	@RequestMapping(value = "/addassetform")
	public ModelAndView assetRegestration(ModelAndView mv ,Model m) {
		m.addAttribute("command", new Asset());
		return mv;
	}
//	@RequestMapping(value = "/register")
//	public ModelAndView employeeRegestration(@ModelAttribute("empBean") EmployeeBean empBean ) {
//
//		 empService.addEmployee(empBean);
//		ModelAndView mav = new ModelAndView("dashboard");
//		return mav;
//	}
	

	
//	@RequestMapping(value = "/addadmin",method = RequestMethord.GET)

//	@PostMapping("/addAdmin")
//	public ResponseEntity<AdminBean>addAdmin(@RequestBody AdminBean adminBean)
//		}
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public ModelAndView addAdmin(ModelAndView mv) {
//		return mv;
//	}{
//		adminService.addAdmin(adminBean);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//
//	//add Admin Data
//	@RequestMapping(value = "/addAdminData", method = RequestMethod.GET)
//	public ModelAndView addAdminData(ModelAndView mv, @ModelAttribute("adminBean") AdminBean adminBean) {
//		adminService.addAdmin(adminBean);
//		return mv;
//	}
//	@RequestMapping(value = "/addAdminTest", method = RequestMethod.GET)
//	public ModelAndView OnlyTest(ModelAndView mv) {
//		return mv;
//	}
//
//	//view Admin Data
//	@RequestMapping(value = "/viewAdminData")
//	public ModelAndView adminViewAll(ModelAndView mv, Model m) {
//		List<AdminBean> adminBean = adminService.viewAllAdmin();
//		m.addAttribute("AdminBean", adminBean);
//		return mv;
//	}
//	//edit Admin Data
//	@RequestMapping(value = "/editAdminData/{adminId}",method = RequestMethod.GET)
//	public ModelAndView viewAdminById(@PathVariable("adminId")int adminId,ModelAndView mv,Model m)
//	{
//		mv = new ModelAndView("editAdminData");
//		AdminBean adminBean = adminService.viewAdminById(adminId);
//		m.addAttribute("AdminBean", adminBean);
//		return mv;
//	}
//	@RequestMapping(value = "/editAdminData/editAdmin")
//	public ModelAndView editAdmin(@ModelAttribute("adminBean")AdminBean adminBean,ModelAndView mv)
//	{
//		mv= new ModelAndView("editAdmin");
//		adminService.editAdmin(adminBean);
//		return mv;
//	}
//	//delete admin data
//	@RequestMapping(value = "deleteAdmin/{adminId}")
//	public ModelAndView deleteAdmin(@PathVariable("adminId")int adminId,ModelAndView mv)
//	{
//		mv = new ModelAndView("deleteAdmin");
//		adminService.deleteAdmin(adminId);
//		return mv;
//	}

//	@RequestMapping(value = "/login")
//	public ModelAndView viewHomePage(ModelAndView mv) {
//
//		Admin admin =new Admin();
//		mv.addObject("admin", admin);
//		return mv;
//	}
//	@RequestMapping("/login")    
//    public ModelAndView showform(ModelAndView m){    
//        m.addObject("admin", new Admin());  
//        return m;   
//    }  
//	
	 

//
//	@RequestMapping(value = "/employeeregestration")
//	public ModelAndView employeeRegestration(ModelAndView mv) {
//
//		return mv;
//	}
//	@RequestMapping(value = "/ticketcreation")
//	public ModelAndView createTicket(ModelAndView mv) {
//		return mv;
//	}
//	@RequestMapping(value = "/assetinfo")
//	public ModelAndView assetInfo(ModelAndView mv) {
//		return mv;
//	}
//	@RequestMapping(value = "/loginpage1")
//	public ModelAndView viewLogin(ModelAndView mv) {
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
