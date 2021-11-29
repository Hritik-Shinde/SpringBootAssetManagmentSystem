package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeService;
@RequestMapping(value = "/addEmployee",method = RequestMethod.GET)

@PostMapping("/addEmployee")
public ResponseEntity<EmployeeBean>addEmp(@RequestBody EmployeeBean employeeBean)
{
	employeeService.addEmployee(employeeBean);
	return new ResponseEntity<>(HttpStatus.CREATED);
}

@PostMapping("/modifyEmployee")
public ResponseEntity<EmployeeBean>modifyEmp(@RequestBody EmployeeBean employeeBean)
{
	employeeService.editEmployee(employeeBean);
	return new ResponseEntity<>(HttpStatus.CREATED);
}
@GetMapping("/viewEmployeeById/{empId}")
public ResponseEntity<EmployeeBean> viewAdmin(@PathVariable(value = "empId") int empId) {
	EmployeeBean employeeBean = employeeService.viewEmployeeById(empId);
	return new ResponseEntity<>(employeeBean, HttpStatus.OK);
}
}
