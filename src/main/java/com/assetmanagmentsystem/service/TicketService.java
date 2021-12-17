package com.assetmanagmentsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.model.Ticket;
import com.assetmanagmentsystem.repositry.TicketRepositry;
/**
 * 
 * @author HritikShinde
 *
 */
@Service
public class TicketService {
	@Autowired
	private TicketRepositry ticketRepositry;
	public Ticket addTicket(Ticket ticket) {
		return ticketRepositry.save(ticket);
	}
	public List<Ticket> getAllticket() {
		return ticketRepositry.findAll();
	}
	public Boolean deleteticket(int venderId) {
		// TODO Auto-generated method stub
		ticketRepositry.deleteById(venderId);
		return true;
	
	}
	public Ticket updateTicket(int venderId, Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepositry.save(ticket);
	}
	public Ticket getTicketById(Integer venderId) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketRepositry.getById(venderId);
		return ticket;
		
	}
}
