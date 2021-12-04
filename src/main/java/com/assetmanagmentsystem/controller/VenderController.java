package com.assetmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.VenderBean;
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
	mv = new ModelAndView("venderregister");

	return mv;
}

@PostMapping(value = "/editVenderDetails")
public ModelAndView editVender(ModelAndView mv,Model m,@ModelAttribute("ven") VenderBean ven) {
	System.out.println("in con" + ven);
	int venderId = ven.getVenderId();
	VendereService.updateVender(venderId, ven);
	String message2 = "Vendor edited sucesfully";
	List<VenderBean> venderList = VendereService.viewAllVender();
	mv = new ModelAndView("viewvenderform");
	System.out.println(venderList);
	m.addAttribute("venderList", venderList);

	return mv;
}
@GetMapping(value = "/venderEdit/{venderId}")
public ModelAndView editEmployee(@PathVariable(name = "venderId") Integer venderId,ModelAndView mv,Model m)
{
	System.out.println(venderId);
	Vender vender = VendereService.getVenderById(venderId);
	mv = new ModelAndView("venderEdit");
	m.addAttribute("ven", vender);
	return mv;
}
@GetMapping(value ="/viewvenderform")
public  ModelAndView virewvender(ModelAndView mv,Model m)
{
	List<VenderBean> venderList = VendereService.viewAllVender();
	 mv = new ModelAndView("viewvenderform");
	 System.out.println(venderList);
	 m.addAttribute("venderList",venderList);
	 return mv;
}
@RequestMapping(value = "/deletevender/{venderId}")
public ModelAndView deleteEmployee(@PathVariable("venderId")int venderId,ModelAndView mv)
{
	VendereService.deletevender(venderId);
	mv = new ModelAndView("Delete");
	return mv;
}
}
