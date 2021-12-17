package com.assetmanagmentsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.service.EmployeeService;
/**
 * 
 * @author HritikShinde
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("employee", new Employee());
		return mav;
	}

	// dashboard
	@PostMapping(value = "/dashboard")
	public ModelAndView viewDashBoard(@ModelAttribute("employee") Employee employee, ModelAndView mv, Model m,HttpServletRequest request) {
		Employee employee2 = employeeService.getEmployeeEmailAndPasseord(employee.getEmailId(), employee.getPassword());
		if (employee2 != null) {
			if (employee2.getRole().equalsIgnoreCase("Admin")) {
				mv = new ModelAndView("sidebar");
			} else {
				HttpSession session=request.getSession(); 
				session.setAttribute("session", employee2.getEmpId());

				mv = new ModelAndView("sidebarEmployee");
				m.addAttribute("employee", employee2);
				
			}
		} else {

			mv = new ModelAndView("error");
		}
		System.out.println(employee2);

		return mv;

	}

	@RequestMapping(value = "/employeeregestrationform")
	public ModelAndView employeeRegestration(ModelAndView mv, Model m) {
		m.addAttribute("employee", new Employee());
		return mv;
	}

	@PostMapping(value = "/register")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee, ModelAndView mv, Model m) {

		System.out.println(employee);
		employeeService.addEmployee(employee);
		List<Employee> empList = employeeService.getAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);
//		mv = new ModelAndView("success");
		return mv;

	}

	@GetMapping(value = "/viewEmployee")
	public ModelAndView viewEmployee(ModelAndView mv, Model m) {

		List<Employee> empList = employeeService.getAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);
		return mv;

	}

	@GetMapping(value = "/editEmp/{empId}")
	public ModelAndView editEmployee(@PathVariable(name = "empId") Integer empId, ModelAndView mv, Model m) {
		System.out.println(empId);
		Employee employee = employeeService.getemployeeById(empId);
		mv = new ModelAndView("empEdit");
		m.addAttribute("emp", employee);
		return mv;
	}

	@PostMapping(value = "/editEmpDetails")
	public ModelAndView editEmp(ModelAndView mv, Model m, @ModelAttribute("Employee") Employee employee) {
		System.out.println("in con" + employee);
		int empId = employee.getEmpId();
		Employee employee2 = employeeService.updateEmployee(empId, employee);
		String message2 = "emp edited sucesfully";
		List<Employee> empList = employeeService.getAllEmployee();
		mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);

		return mv;
	}



	@PostMapping("/employee")
	public Employee AddEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/deleteemployee/{empId}")
	public ModelAndView deleteEmployee(@PathVariable("empId") int empId,Model m) {

		Boolean flag = employeeService.deleteEmployee(empId);
		List<Employee> empList = employeeService.getAllEmployee();
		ModelAndView mv = new ModelAndView("viewEmployee");
		System.out.println(empList);
		m.addAttribute("empList", empList);

		return mv;
	}


}
