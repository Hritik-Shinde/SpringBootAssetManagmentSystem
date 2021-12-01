package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.model.Vender;
import com.assetmanagmentsystem.service.VenderService;

@RestController
public class VenderController {
@Autowired
VenderService VendereService;



@PostMapping(value = "/venderregister")
public ModelAndView registerEmp(ModelAndView mv, @ModelAttribute("vender") Vender vender)
{
	System.out.println("in con"+vender);
	VendereService.addVender(vender);
	String message2 = "vender added sucesfully";
	mv.addObject(message2);
	mv = new ModelAndView("vendorregestrationform");

	return mv;
}
//@RequestMapping(value = "/addVender",method = RequestMethod.GET)


//@PostMapping("/addVender")
//public ResponseEntity<VenderBean>addEmp(@RequestBody VenderBean venderBean)
//{
//	VendereService.addVender(venderBean);
//	return new ResponseEntity<>(HttpStatus.CREATED);
//}
//
//@PostMapping("/modifyVender")
//public ResponseEntity<VenderBean>modifyEmp(@RequestBody VenderBean venderBean)
//{
//	VendereService.editVender(venderBean);
//	return new ResponseEntity<>(HttpStatus.CREATED);
//}
//@GetMapping("/viewVenderById/{empId}")
//public ResponseEntity<VenderBean> sviewAdmin(@PathVariable(value = "empId") int empId) {
//	VenderBean venderBean = VendereService.viewVenderById(empId);
//	return new ResponseEntity<>(venderBean, HttpStatus.OK);
//}
}
