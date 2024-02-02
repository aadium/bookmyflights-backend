package com.excelr.bookmyflights.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookmyflights.Service.TicketService;

import com.excelr.bookmyflights.model.Ticket;

@RestController
@CrossOrigin
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketService service;

	@PostMapping("/saveTicket")
	public String saveTicket(@RequestBody Ticket tk) {
		service.save(tk);
		return "done";
	}

	@GetMapping("/getTickets")
	public List<Ticket> GetFlight() {
		return service.gettickets();
	}

	@GetMapping("/getTicket/{Id}")
	public Ticket GetFlightById(@RequestBody Ticket Id) {
		return service.getticketById(Id);
	}

}
