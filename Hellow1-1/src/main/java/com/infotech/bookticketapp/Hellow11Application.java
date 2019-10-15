package com.infotech.bookticketapp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.entity.Ticket;
import com.infotech.service.BookingticketService;

@SpringBootApplication
public class Hellow11Application {

	
	public static void main(String[] args) {
	ConfigurableApplicationContext	ApplicationContext=SpringApplication.run(Hellow11Application.class, args);
	
		BookingticketService bookingticketService=ApplicationContext.getBean("BookingticketService", BookingticketService.class);
		
	/*		Ticket ticket=new Ticket();
			
			ticket.setBookingdate(new Date());
			ticket.setPassangerName("mahadev");
			ticket.setEmail("mahadev@gmail.com");
			ticket.setSourceDestination("pune");
			ticket.setDestination("sangali");
			bookingticketService.createTicket(ticket);*/
	}

}
