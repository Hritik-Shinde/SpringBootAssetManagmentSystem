package com.assetmanagmentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.repositry.EmployeeRepositry;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;

	public Employee getEmployeeEmailAndPasseord(String emailId, String password) {
		return employeeRepositry.findByEmailIdAndPassword(emailId, password);
	}

	public Employee addEmployee(Employee employee) {
		
		return employeeRepositry.save(employee);
	}

	public List<Employee> getAllEmployee() {
		
		return employeeRepositry.findByRole("Employee");
	}

}
