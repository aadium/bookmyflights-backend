package com.excelr.bookmyflights.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookmyflights.Service.TicketService;

import com.excelr.bookmyflights.model.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketService service;

	@PostMapping("/saveTicket/{Id}")
	public String saveTicket(@RequestBody Ticket Id) {
		service.save(Id);
		return "done";
	}

	@GetMapping("/getTicket")
	public List<Ticket> GetFlight() {
		return service.getticket();
	}

}
