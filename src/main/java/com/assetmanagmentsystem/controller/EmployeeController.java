package com.assetmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/register")
	public ModelAndView registerEmp(ModelAndView mv, @ModelAttribute("emp") Employee emp) {
		System.out.println("in con" + emp);
		employeeService.addEmployee(emp);
		String message2 = "emp added sucesfully";
		mv.addObject(message2);
		mv = new ModelAndView("employeeregestrationform");
		return mv;
	}
	
	@PostMapping(value = "/editEmpDetails")
	public ModelAndView editEmp(ModelAndView mv,Model m,@ModelAttribute("emp") EmployeeBean emp) {
		System.out.println("in con" + emp);
		int empId = emp.getEmpId();
		employeeService.updateEmployee(empId, emp);
		String message2 = "emp edited sucesfully";
		List<EmployeeBean> empList = employeeService.viewAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);

		return mv;
	}

	@GetMapping(value = "/viewEmployee")
	public ModelAndView virewvender(ModelAndView mv, Model m) {
		List<EmployeeBean> empList = employeeService.viewAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);
		return mv;
	}

	@RequestMapping(value = "/deleteemployee/{empId}")
	public ModelAndView deleteEmployee(@PathVariable("empId") int empId, ModelAndView mv,Model m) {
		employeeService.deleteEmpolyee(empId);
		List<EmployeeBean> empList = employeeService.viewAllEmployee();
		System.out.println(empList);
		m.addAttribute("empList", empList);
		mv = new ModelAndView("Delete");
		
		return mv;
	}

	@GetMapping(value = "/editEmp/{empId}")
	public ModelAndView editEmployee(@PathVariable(name = "empId") Integer empId,ModelAndView mv,Model m)
	{
		System.out.println(empId);
		Employee employee = employeeService.getEmployeeById(empId);
		mv = new ModelAndView("empEdit");
		m.addAttribute("emp", employee);
		return mv;
	}

	@RequestMapping(value = "/empdashboard")
	public ModelAndView viewDashBoard(ModelAndView mv) {
		return mv;
	}

	@RequestMapping(value = "/ticketcreation")
	public ModelAndView viewEmployee(ModelAndView mv) {

		return mv;
	}
}
