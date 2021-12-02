package com.assetmanagmentsystem.service;

import com.assetmanagmentsystem.bean.TicketBean;
import com.assetmanagmentsystem.model.Ticket;

public interface TicketService {
	public String addTicket(Ticket ticket);

	void deleteTicket(int ticketId);

	TicketBean viewTicketById(int ticketId);

}
