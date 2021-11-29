package com.assetmanagmentsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.assetmanagmentsystem.bean.AdminBean;
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
	public void addEmployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.maptoEntity(employeeBean);
		employeeRepositry.save(employee);
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

	@Override
	public void editEmployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		Optional<Employee> employeeOptional = employeeRepositry.findById(employeeBean.getEmpId());
		if(employeeOptional.isPresent())
		{
			Employee employee = employeeOptional.get();
			employee.setEmpId(employeeBean.getEmpId());
			employee.setEmpName(employeeBean.getEmpName());
			employee.setEmpLastName(employeeBean.getEmpLastName());
			employee.setMaterialStatus(employeeBean.getMaterialStatus());
			employee.setDateOBPlace(employeeBean.getDateOBPlace());
			employee.setMobileNo(employeeBean.getMobileNo());
			employee.setEmailId(employeeBean.getEmailId());
			employee.setBloodGroup(employeeBean.getBloodGroup());
			//employee.setPassword(employeeBean.getPassword());
			employee.setDepartment(employeeBean.getDepartment());
			employee.setGender(employeeBean.getGender());
			employee.setCountry(employeeBean.getCountry());
			employee.setState(employeeBean.getState());
			employee.setCity(employeeBean.getCity());
			employee.setAddress(employeeBean.getAddress());
			employee.setDateOB(employeeBean.getDateOB());
			employee.setJoiningDate(employeeBean.getJoiningDate());
			
			employeeRepositry.save(employee);
		} else {
//			throw Exception  (Invalid employee)
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

}
