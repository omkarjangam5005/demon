package com.infotech.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket-id")
	private int ticketId;
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getSourceDestination() {
		return sourceDestination;
	}

	public void setSourceDestination(String sourceDestination) {
		this.sourceDestination = sourceDestination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="passanger-name", nullable=false)
	private String passangerName;
	
	@Column(name="booking-date")
	private Date bookingdate;
	
	@Column(name="source-destination")
	private String sourceDestination;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="email")
	private String email;
}
