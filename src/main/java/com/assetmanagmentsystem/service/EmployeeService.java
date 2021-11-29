package com.assetmanagmentsystem.service;

import java.util.List;

import com.assetmanagmentsystem.bean.EmployeeBean;

public interface EmployeeService {
	void addEmployee(EmployeeBean employeeBean);

	EmployeeBean viewEmployeeById(int empId);

	List<EmployeeBean> viewAllEmployee();

	void editEmployee(EmployeeBean employeeBean);

	void deleteEmpolyee(int empId);

}
