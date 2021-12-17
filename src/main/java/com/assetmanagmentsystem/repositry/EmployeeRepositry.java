package com.assetmanagmentsystem.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetmanagmentsystem.model.Employee;
/**
 * 
 * @author HritikShinde
 *
 */
@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Integer>{

	Employee findByEmailIdAndPassword(String emailId, String password);

	List<Employee> findByRole(String string);

	Employee findByEmpId(int empId);
	
	/* Employee editEmployeeById(int empId); */
	
}
