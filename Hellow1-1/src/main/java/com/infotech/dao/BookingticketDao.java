package com.infotech.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.entity.Ticket;

@Repository
public interface BookingticketDao extends CrudRepository<Ticket, Integer> {

}
