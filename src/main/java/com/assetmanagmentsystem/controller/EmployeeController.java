package com.assetmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("employee", new Employee());
		return mav;
	}

	// dashboard
	@PostMapping(value = "/dashboard")
	public ModelAndView viewDashBoard(@ModelAttribute("employee") Employee employee, ModelAndView mv, Model m) {
		Employee employee2 = employeeService.getEmployeeEmailAndPasseord(employee.getEmailId(), employee.getPassword());
		if (employee2 != null) {
			if (employee2.getRole().equalsIgnoreCase("Admin")) {
				mv = new ModelAndView("adminDashboard");
			} else {
				mv = new ModelAndView("employeeDashboard");
			}
		} else {

			mv = new ModelAndView("error");
		}
		System.out.println(employee2);

		return mv;

	}
	
	
	@RequestMapping(value = "/employeeregestrationform")
	public ModelAndView employeeRegestration(ModelAndView mv ,Model m) {
		m.addAttribute("employee", new Employee());
		return mv;
	}
	
	@PostMapping(value = "/register")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee, ModelAndView mv, Model m) {
		
		System.out.println(employee);
		employeeService.addEmployee(employee);
		mv = new ModelAndView("success");
		return mv;

	}
	@GetMapping(value = "/viewEmployee")
	public ModelAndView viewEmployee(ModelAndView mv, Model m) {
		
		List<Employee> empList = employeeService.getAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);
		return mv;

	}
	

	// employeedashboard

//	@PostMapping(value = "/empdashboard")
//	public ModelAndView viewempDashBoard(@ModelAttribute("employee") Employee employee, ModelAndView mv, Model m) {
//		Employee employee2 = employeeService.findByEmployeeNameAndPassword(employee.getEmailId(),
//				employee.getPassword());
//		if (employee2 == null) {
//			mv = new ModelAndView("error");
//			return mv;
//		} else {
//			return mv;
//		}
//
//	}

//	@PostMapping("/employee")
//	public Employee AddEmployee(@RequestBody Employee employee) {
//		System.out.println(employee);
//		return employeeService.addEmployee(employee);
//	}

//	// dashboard
//	@PostMapping(value = "/dashboard")
//	public ModelAndView viewDashBoard(@ModelAttribute("admin") Admin admin, ModelAndView mv, Model m) {
//
//		Admin admin2 = adminService.findByAdminNameAndPassword(admin.getAdminName(), admin.getPassword());
//		if (admin2 == null) {
//			mv = new ModelAndView("error");
//			return mv;
//		} else {
//			return mv;
//		}
//
//	}

//	@PostMapping(value = "/register")
//	public ModelAndView registerEmp(ModelAndView mv, @ModelAttribute("emp") Employee emp) {
//		System.out.println("in con" + emp);
//		employeeService.addEmployee(emp);
//		String message2 = "emp added sucesfully";
//		mv.addObject(message2);
//		mv = new ModelAndView("employeeregestrationform");
//		return mv;
//	}
//
//	@PostMapping(value = "/editEmpDetails")
//	public ModelAndView editEmp(ModelAndView mv, Model m, @ModelAttribute("emp") EmployeeBean emp) {
//		System.out.println("in con" + emp);
//		int empId = emp.getEmpId();
//		employeeService.updateEmployee(empId, emp);
//		String message2 = "emp edited sucesfully";
//		List<EmployeeBean> empList = employeeService.viewAllEmployee();
//		mv = new ModelAndView("viewEmployee");
//		System.out.println(empList);
//		m.addAttribute("empList", empList);
//
//		return mv;
//	}
//
//	@GetMapping(value = "/viewEmployee")
//	public ModelAndView virewvender(ModelAndView mv, Model m) {
//		List<EmployeeBean> empList = employeeService.viewAllEmployee();
//		mv = new ModelAndView("viewEmployee");
//		System.out.println(empList);
//		m.addAttribute("empList", empList);
//		return mv;
//	}
//
//	@RequestMapping(value = "/deleteemployee/{empId}")
//	public ModelAndView deleteEmployee(@PathVariable("empId") int empId, ModelAndView mv, Model m) {
//		employeeService.deleteEmpolyee(empId);
//		List<EmployeeBean> empList = employeeService.viewAllEmployee();
//		System.out.println(empList);
//		m.addAttribute("empList", empList);
//		mv = new ModelAndView("Delete");
//
//		return mv;
//	}
//
//	@GetMapping(value = "/editEmp/{empId}")
//	public ModelAndView editEmployee(@PathVariable(name = "empId") Integer empId, ModelAndView mv, Model m) {
//		System.out.println(empId);
//		Employee employee = employeeService.getEmployeeById(empId);
//		mv = new ModelAndView("empEdit");
//		m.addAttribute("emp", employee);
//		return mv;
//	}
//
//	@RequestMapping(value = "/empdashboard")
//	public ModelAndView viewDashBoard(ModelAndView mv) {
//		return mv;
//	}
//
//	@RequestMapping(value = "/ticketcreation")
//	public ModelAndView viewEmployee(ModelAndView mv) {
//
//		return mv;
//	}
}
