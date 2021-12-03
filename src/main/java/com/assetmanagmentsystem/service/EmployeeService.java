package com.assetmanagmentsystem.service;

import java.util.List;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.model.Admin;
import com.assetmanagmentsystem.model.Employee;

public interface EmployeeService {
	String addEmployee(Employee employee);

	EmployeeBean viewEmployeeById(int empId);

	List<EmployeeBean> viewAllEmployee();

	void updateEmployee(int id, EmployeeBean employeeBean);

	void deleteEmpolyee(int empId);

	public Employee getEmployeeById(int id);
	/*
	 * Employee findByEmployeeNameAndPassword(String string, String string2);
	 */

}
