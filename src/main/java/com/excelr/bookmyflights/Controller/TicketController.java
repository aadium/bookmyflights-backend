package com.excelr.bookmyflights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookmyflights.service.TicketService;
import com.excelr.bookmyflights.exceptions.ResourceNotFoundException;
import com.excelr.bookmyflights.model.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketService service;

	@PostMapping("/saveTicket")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Ticket saveTicket(@RequestBody Ticket tk) {
		return service.saveTicket(tk);
	}

	@GetMapping("/getTickets")
	@PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_ADMIN')")
	public List<Ticket> getTickets() {
		return service.getTickets();
	}

	@GetMapping("/getTicket/{Id}")
	@PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_ADMIN')")
	public Ticket GetTicketById(@RequestBody String id) {
		Ticket tk = service.getTicketById(id);
		if (tk == null) {
			throw new ResourceNotFoundException("Ticket not found");
		}
		return tk;
	}

	@GetMapping("/deleteTicket/{Id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Ticket deleteTicket(@RequestBody String id) {
		Ticket tk = service.deleteTicket(id);
		if (tk == null) {
			throw new ResourceNotFoundException("Ticket not found");
		}
		return tk;
	}

}
