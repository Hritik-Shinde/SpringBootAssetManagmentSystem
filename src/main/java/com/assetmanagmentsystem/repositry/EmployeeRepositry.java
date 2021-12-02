package com.assetmanagmentsystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetmanagmentsystem.model.Admin;
import com.assetmanagmentsystem.model.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Integer>{

	
	/* Employee findByUserIdAndPassword(String string, String string2); */
}
