package com.assetmanagmentsystem.service;


import com.assetmanagmentsystem.bean.TicketBean;

public interface TicketService {
	void addTicket(TicketBean ticketBean);
	void deleteTicket(int ticketId);
	TicketBean viewTicketById(int ticketId);
	
}
