package com.infotech.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.dao.BookingticketDao;
import com.infotech.entity.Ticket;

@Service
public class BookingticketService {
	
	
	@Autowired
	BookingticketDao bookingticketDao;

	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return  bookingticketDao.save(ticket);
	}
	
	
	public Optional<Ticket> getTicketbyId(Integer ticketId) {
		return bookingticketDao.findById(ticketId);
		
		
	}

}
