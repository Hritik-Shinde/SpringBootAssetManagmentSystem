package com.assetmanagmentsystem.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.repositry.AssetRepositry;
import com.assetmanagmentsystem.repositry.EmployeeRepositry;
/**
 * 
 * @author HritikShinde
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	

	public Employee getEmployeeEmailAndPasseord(String emailId, String password) {
		return employeeRepositry.findByEmailIdAndPassword(emailId, password);
	}

	/*
	 * public static void main(String[] args) { EmployeeService employeeService =
	 * new EmployeeService(); Employee emp=
	 * employeeService.getEmployeeEmailAndPasseord("Hritikshinde13@gmail.com",
	 * "12345"); System.out.println(emp); j1 karun Call kartoCall tula bye }
	 */
	public Employee addEmployee(Employee employee) {

		return employeeRepositry.save(employee);
	}

	public List<Employee> getAllEmployee() {
		List<Employee> employees=employeeRepositry.findByRole("Employee");
		
		return employees;
	}

	public Employee updateEmployee(int empId, Employee employee) {

		return employeeRepositry.save(employee);
	}

	public boolean deleteEmployee(int empId) {
		employeeRepositry.deleteById(empId);
		return true;
	}

	public Employee getemployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepositry.getById(empId);
		return employee;
	}

}
