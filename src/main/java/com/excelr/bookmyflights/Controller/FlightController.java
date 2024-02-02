package com.excelr.bookmyflights.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookmyflights.Service.FlightService;
import com.excelr.bookmyflights.model.Flight;

@RestController
@CrossOrigin
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	FlightService service;
	
	@GetMapping("/getFlights")
	public List<Flight> GetFlight() {
		return service.getflight();
	}

	@GetMapping("/getFlight/{Id}")
	public Flight GetFlightById(@PathVariable Flight Id) {
		return service.getflightById(Id);
	}

	@PostMapping("/saveFlight")
	public String saveFlight(@RequestBody Flight fl) {
		service.save(fl);
		return "done";
	}

	@PutMapping("/decrementSeats/{Id}")
	public String decrementSeats(@PathVariable Flight Id) {
		service.decrementSeats(Id);
		return "done";
	}

	@PutMapping("/updateFlight")
	public String updateFlight(@RequestBody Flight fl) {
		service.save(fl);
		return "done";
	}

	@DeleteMapping("/deleteFlight/{Id}")
	public String deleteFlight(@PathVariable Flight Id) {
		service.delete(Id);
		return "done";
	}
}
