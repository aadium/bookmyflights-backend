package com.excler.bookmyflights.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.bookmyflights.Repository.TicketRepository;
import com.excelr.bookmyflights.model.Ticket;

@Service
public class TicketService {
	@Autowired
	TicketRepository repo;
	
	public String save (Ticket t1) {
		repo.save (t1);
		return ("Flight Added with ID: "+t1.getTicketId());
	}
	public List<Ticket> getticket(){
		return repo.findAll();
	}

}
