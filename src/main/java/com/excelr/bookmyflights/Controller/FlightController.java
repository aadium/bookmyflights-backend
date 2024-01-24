package com.excelr.bookmyflights.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.excelr.bookmyflights.Service.FlightService;
import com.excelr.bookmyflights.model.Flight;

public class FlightController {

	
	
	@Autowired
	FlightService service;
	
	
	@PostMapping("/saveFilght/{Id}")
	public String saveFlight (@RequestBody Flight Id)
	{
		service.save(Id);
		return "done";
	}
	
	
	@GetMapping("/getFlight")
	public List<Flight> GetFlight(){
		return service.getflight ();
	}
	
	
	
	
}
