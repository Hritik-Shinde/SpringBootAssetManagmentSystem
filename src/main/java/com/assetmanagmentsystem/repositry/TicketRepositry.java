package com.assetmanagmentsystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assetmanagmentsystem.model.Ticket;
/**
 * 
 * @author HritikShinde
 *
 */
public interface TicketRepositry extends JpaRepository<Ticket, Integer> {

}
