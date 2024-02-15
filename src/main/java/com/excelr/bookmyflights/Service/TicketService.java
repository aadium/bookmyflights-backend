package com.excelr.bookmyflights.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.bookmyflights.repository.TicketRepository;
import com.excelr.bookmyflights.model.Ticket;

@Service
public class TicketService {
	@Autowired
	TicketRepository repo;
	
	public String save (Ticket t1) {
		repo.save (t1);
		return ("Flight Added with ID: "+t1.getTicketId());
	}
	public List<Ticket> gettickets(){
		return repo.findAll();
	}
	public Ticket getticketById(Ticket id) {
		return repo.findById(id.getTicketId()).orElse(null);
	}

}
