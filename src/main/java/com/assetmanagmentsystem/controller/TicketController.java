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

import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.Ticket;
import com.assetmanagmentsystem.service.TicketService;
/**
 * 
 * @author HritikShinde
 *
 */
@RestController
public class TicketController {
@Autowired
TicketService ticketService;

@RequestMapping(value = "/raiseTicket")
public ModelAndView ticketRegestration(ModelAndView mv ,Model m) {
	m.addAttribute("ticket", new Ticket());
	return mv;
}

@PostMapping(value = "/registerTicket")
public ModelAndView addTicket(@ModelAttribute("ticket") Ticket ticket, ModelAndView mv, Model m) {	
	System.out.println(ticket);
	Ticket ticket2=ticketService.addTicket(ticket);
	mv = new ModelAndView("success2");
	return mv;

}


@GetMapping(value = "/viewTicket")
public ModelAndView viewEmployee(ModelAndView mv, Model m) {
	
	List<Ticket> ticket=ticketService.getAllticket();
	mv = new ModelAndView("viewTicket");
	System.out.println(ticket);
	m.addAttribute("ticket", ticket);
	return mv;

}
@GetMapping(value = "/ticketEdit/{ticketId}")
public ModelAndView editEmployee(@PathVariable(name = "ticketId") Integer ticketId, ModelAndView mv, Model m) {
	System.out.println(ticketId);
	Ticket ticket = ticketService.getTicketById(ticketId);
	mv = new ModelAndView("ticketEdit");
	m.addAttribute("ticket", ticket);
	return mv;
}

@PostMapping(value = "/editTicketDetails")
public ModelAndView editEmp(ModelAndView mv, Model m, @ModelAttribute("Ticket") Ticket ticket) {
	System.out.println("in con" + ticket);
	int ticketId = ticket.getTicketId();
	Ticket ticket2 = ticketService.updateTicket(ticketId, ticket);
	String message2 = "ticket edited sucesfully";
	Ticket ticketList = ticketService.getTicketById(ticketId);
	
	System.out.println(ticketList);
	m.addAttribute("venderList", ticketList);
	mv = new ModelAndView("viewTicket");

	return mv;
}


@RequestMapping(value = "/deleteTicket/{ticketId}")
public ModelAndView deleteAsset(@PathVariable("ticketId") int ticketId,ModelAndView mv,Model m) {

	Boolean flag = ticketService.deleteticket(ticketId);
	List<Ticket> ticket=ticketService.getAllticket();
	mv = new ModelAndView("viewTicket");
	System.out.println(ticket);
	m.addAttribute("ticket", ticket);
	return mv;

}
}
