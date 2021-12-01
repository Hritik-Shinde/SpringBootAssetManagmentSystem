package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.model.Admin;
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
@PostMapping(value = "/empdashboard")
public ModelAndView viewDashBoard(ModelAndView mv) {
	return mv;
	}

@RequestMapping(value = "/ticketcreation")
public ModelAndView viewEmployee(ModelAndView mv) {

	return mv;
}
}
