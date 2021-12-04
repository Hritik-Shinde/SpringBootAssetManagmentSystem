package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Ticket;
import com.assetmanagmentsystem.service.TicketService;

public class TicketController {

	
	@Autowired
	TicketService ticketService;

	@PostMapping(value = "/viewTicketForm")
	public ModelAndView viewTicket(ModelAndView mv, @ModelAttribute("ticket") Ticket ticket)
	{
		ticketService.addTicket(ticket);
		String message2 = "ticket added sucesfully";
		mv.addObject(message2);
		mv = new ModelAndView("ticketcreationForm");

		return mv;
	}

	@PostMapping(value = "/ticketregister")
	public ModelAndView registerTicket(ModelAndView mv, @ModelAttribute("ticket") Ticket ticket) {
		System.out.println("in con" + ticket);
		ticketService.addTicket(ticket);
		String message2 = "ticket added sucesfully";
		mv.addObject(message2);
		mv = new ModelAndView("ticketCreationForm");

		return mv;
	}

}
