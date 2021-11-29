package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.TicketBean;
import com.assetmanagmentsystem.model.Ticket;

@Component
public class TicketMapper {
	public TicketBean maptoBean(Ticket ticket) {
		TicketBean bean = new TicketBean();
		bean.setTicketId(ticket.getTicketId());
		bean.setAssetId(ticket.getAssetId());
		bean.setEmpId(ticket.getEmpId());
		bean.setStatus(ticket.getStatus());
		bean.setTicketRaiseDate(ticket.getTicketRaiseDate());
		bean.setDateModify(ticket.getDateModify());
		return bean;

	}

	public Ticket maptoEntity(TicketBean ticketBean) {
		Ticket ticket = new Ticket();
		ticket.setTicketId(ticketBean.getTicketId());
		ticket.setAssetId(ticketBean.getAssetId());
		ticket.setEmpId(ticketBean.getEmpId());
		ticket.setStatus(ticketBean.getStatus());
		ticket.setTicketRaiseDate(ticketBean.getTicketRaiseDate());
		ticket.setDateModify(ticketBean.getDateModify());
		return ticket;
	}
}
