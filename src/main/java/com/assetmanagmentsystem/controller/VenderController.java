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

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.model.Vender;
import com.assetmanagmentsystem.service.VenderService;
/**
 * 
 * @author HritikShinde
 *
 */
@RestController
public class VenderController {
@Autowired
private VenderService VendereService;

@RequestMapping(value = "/venderRegestrationform")
public ModelAndView venderRegestration(ModelAndView mv ,Model m) {
	m.addAttribute("vender", new Vender());
	return mv;
}

@PostMapping(value = "/venderRegister")
public ModelAndView addVender(@ModelAttribute("vender") Vender vender, ModelAndView mv, Model m) {	
	System.out.println(vender);
	Vender vender2=VendereService.addVender(vender);

	List<Vender> venders=VendereService.getAllAvender();
	mv = new ModelAndView("viewVender");
	System.out.println(venders);
	m.addAttribute("vender", venders);
	return mv;
}
@GetMapping(value = "/viewVender")
public ModelAndView viewVender(ModelAndView mv, Model m) {
	
	List<Vender> vender=VendereService.getAllAvender();
	mv = new ModelAndView("viewVender");
	System.out.println(vender);
	m.addAttribute("vender", vender);
	return mv;

}
@GetMapping(value = "/venderEdit/{venderId}")
public ModelAndView editEmployee(@PathVariable(name = "venderId") Integer venderId, ModelAndView mv, Model m) {
	System.out.println(venderId);
	Vender vender = VendereService.getvenderById(venderId);
	mv = new ModelAndView("venderEdit");
	m.addAttribute("ven", vender);
	return mv;
}

@PostMapping(value = "/editVenderDetails")
public ModelAndView editEmp(ModelAndView mv, Model m, @ModelAttribute("Vender") Vender vender) {
	System.out.println("in con" + vender);
	int venderId = vender.getVenderId();
	Vender vender2 = VendereService.updateVender(venderId, vender);
	String message2 = "emp edited sucesfully";
	List<Vender> vender1=VendereService.getAllAvender();
	mv = new ModelAndView("viewVender");
	System.out.println(vender1);
	m.addAttribute("vender", vender1);
	return mv;
}


@RequestMapping(value = "/deletevender/{venderId}")
public ModelAndView deleteAsset(@PathVariable("venderId") int venderId,ModelAndView mv,Model m) {

	Boolean flag = VendereService.deletevender(venderId);
	List<Vender> vender=VendereService.getAllAvender();
	mv = new ModelAndView("viewVender");
	System.out.println(vender);
	m.addAttribute("vender", vender);
	return mv;
}
}
