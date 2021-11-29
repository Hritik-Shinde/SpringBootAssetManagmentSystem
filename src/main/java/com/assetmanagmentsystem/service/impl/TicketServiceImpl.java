package com.assetmanagmentsystem.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.assetmanagmentsystem.bean.TicketBean;
import com.assetmanagmentsystem.mapper.TicketMapper;
import com.assetmanagmentsystem.model.Ticket;
import com.assetmanagmentsystem.repositry.TicketRepositry;
import com.assetmanagmentsystem.service.TicketService;

public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepositry ticketRepositry;
	@Autowired
	private TicketMapper ticketMapper;

	@Override
	public void addTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketMapper.maptoEntity(ticketBean);
		ticketRepositry.save(ticket);
	}

	@Override
	public void deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		Optional<Ticket> ticketOptional = ticketRepositry.findById(ticketId);
		if (ticketOptional.isPresent()) {
			Ticket ticket = ticketOptional.get();

			ticketRepositry.delete(ticket);
		}

	}

	@Override
	public TicketBean viewTicketById(int ticketId) {
		// TODO Auto-generated method stub
		TicketBean response = null;
		// fetch from
		Optional<Ticket> ticketOptional = ticketRepositry.findById(ticketId);
		if (ticketOptional.isPresent()) {
			Ticket ticket = ticketOptional.get();
			response = ticketMapper.maptoBean(ticket);
		}
		return response;

	}
}
