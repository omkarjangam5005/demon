package com.infotech.bookticketapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.entity.Ticket;
import com.infotech.service.BookingticketService;

@RestController
public class bookticketappController {
	
	@Autowired
	 private BookingticketService bookingticketService;
	
	@RequestMapping("welcome")
	public String welcome() {
		return "welcome to the curdes";
		
	}
	
	@RequestMapping("create")
	public Ticket createTicket(Ticket ticket) {
		return bookingticketService.createTicket(ticket);
	}
		
		@GetMapping("ticket/{ticketId}")
		   Optional<Ticket> getTicketbyid(@PathVariable("ticketId")Integer ticketId) {
			
			return bookingticketService.getTicketbyId(ticketId);
			
	
		
	}

}
