package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeService;


@PostMapping(value = "/register")
public ModelAndView registerEmp(ModelAndView mv, @ModelAttribute("emp") Employee emp)
{
	System.out.println("in con"+emp);
	employeeService.addEmployee(emp);
	String message2 = "emp added sucesfully";
	mv.addObject(message2);
	mv = new ModelAndView("employeeregestrationform");

	return mv;
}
//@PostMapping(value = "/delete/{id}")
//public ModelAndView deleteEmp(ModelAndView mv, @ModelAttribute("emp") Employee emp)
//{
//	employeeService.deleteEmpolyee(id);
//	mv = new ModelAndView("employeeregestrationform");
//
//	return mv;
//}
@PostMapping(value = "/empdashboard")
public ModelAndView viewDashBoard(ModelAndView mv) {
	return mv;
	}

@RequestMapping(value = "/ticketcreation")
public ModelAndView viewEmployee(ModelAndView mv) {

	return mv;
}
}
