package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.model.Employee;

@Component
public class EmployeeMapper {
	public EmployeeBean maptoBean(Employee employee)
	{
		
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpId(employee.getEmpId());
		bean.setEmpName(employee.getEmpName());
		bean.setEmpLastName(employee.getEmpLastName());
//		bean.setMaterialStatus(employee.getMaterialStatus());
		bean.setDateOBPlace(employee.getDateOBPlace());
		bean.setMobileNo(employee.getMobileNo());
		bean.setEmailId(employee.getEmailId());
		bean.setBloodGroup(employee.getBloodGroup());
		bean.setPassword(employee.getPassword());
		bean.setDepartment(employee.getDepartment());
		bean.setDateOB(employee.getDateOB());
		bean.setCity(employee.getCity());
		bean.setState(employee.getState());
		bean.setAddress(employee.getAddress());
		bean.setGender(employee.getGender());
		bean.setJoiningDate(employee.getJoiningDate());
		bean.setCountry(employee.getCountry());
		return bean;
	}
	public Employee maptoEntity(EmployeeBean employeeBean)
	{
		Employee employee = new Employee();
		employee.setEmpId(employeeBean.getEmpId());
		employee.setEmpName(employeeBean.getEmpName());
		employee.setEmpLastName(employeeBean.getEmpLastName());
//		employee.setMaterialStatus(employeeBean.getMaterialStatus());
		employee.setDateOBPlace(employeeBean.getDateOBPlace());
		employee.setMobileNo(employeeBean.getMobileNo());
		employee.setEmailId(employeeBean.getEmailId());
		employee.setBloodGroup(employeeBean.getBloodGroup());
		employee.setPassword(employeeBean.getPassword());
		employee.setDepartment(employeeBean.getDepartment());
		employee.setDateOB(employeeBean.getDateOB());
		employee.setCity(employeeBean.getCity());
		employee.setState(employeeBean.getState());
		employee.setAddress(employeeBean.getAddress());
		employee.setGender(employeeBean.getGender());
		employee.setJoiningDate(employeeBean.getJoiningDate());
		employee.setCountry(employeeBean.getCountry());
		return employee;
	}

}
