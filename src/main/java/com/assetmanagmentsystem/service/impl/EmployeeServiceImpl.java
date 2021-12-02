package com.assetmanagmentsystem.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.mapper.EmployeeMapper;
import com.assetmanagmentsystem.model.Admin;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.repositry.EmployeeRepositry;
import com.assetmanagmentsystem.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepositry employeeRepositry;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub\
		System.out.println("service methord"+employee);
		employeeRepositry.save(employee);
		return "sucess";
	}

	@Override
	public EmployeeBean viewEmployeeById(int empId) {
		// TODO Auto-generated method stub
		EmployeeBean response = null;
		//fetch from 
		Optional<Employee>employeeOptional = employeeRepositry.findById(empId);
		if(employeeOptional.isPresent())
		{
			Employee employee = employeeOptional.get();
			response = employeeMapper.maptoBean(employee);
		}
		return response;
	}

	@Override
	public List<EmployeeBean> viewAllEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeBean> employeeBean = new ArrayList<>();
		List<Employee> employee = employeeRepositry.findAll();
		if(!CollectionUtils.isEmpty(employee))
		{
			employee.forEach(b -> employeeBean.add(employeeMapper.maptoBean(b)));
		}
		return employeeBean;
	}

//	@Override
//	public void editEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		if(employee.isPresent())
//		{
//			Employee employee = employeeOptional.get();
//			response = employeeMapper.maptoBean(employee);
//		}
//		employeeRepositry.save(employee);
//	}
	@Override
	public void updateEmployee(int id, EmployeeBean employeeBean) {
		
		Optional<Employee> empOptional = employeeRepositry.findById(id);
		if(empOptional.isPresent()) {
			Employee employee = empOptional.get();
			employee.setEmailId(employeeBean.getEmailId());
			employee.setEmpName(employeeBean.getEmpName());
			employee.setEmpLastName(employeeBean.getEmpLastName());
			employee.setCountry(employeeBean.getCountry());
			employee.setAddress(employeeBean.getAddress());
			employee.setMobileNo(employeeBean.getMobileNo());
			employee.setDateOB(employeeBean.getDateOB());
			employee.setBloodGroup(employeeBean.getBloodGroup());
			employee.setDepartment(employeeBean.getDepartment());
			employee.setGender(employeeBean.getGender());
			employee.setState(employeeBean.getState());
			employee.setCity(employeeBean.getCity());
			employee.setDateOBPlace(employeeBean.getDateOBPlace());
			employee.setJoiningDate(employeeBean.getJoiningDate());
			
			employeeRepositry.save(employee);
		}
	}

	@Override
	public void deleteEmpolyee(int empId) {
		// TODO Auto-generated method stub
		Optional<Employee> employeeOptional = employeeRepositry.findById(empId);
		if(employeeOptional.isPresent()) {
			Employee employee = employeeOptional.get();
			
			employeeRepositry.delete(employee);
		}
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = employeeRepositry.getById(id);
		return employee;
	}
	/*
	 * @Override public Employee findByEmployeeNameAndPassword(String string, String
	 * string2) { Employee employee=
	 * employeeRepositry.findByUserIdAndPassword(string,string2);
	 * System.out.println(employee); return employee; }
	 */

}
