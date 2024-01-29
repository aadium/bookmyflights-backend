package com.excelr.bookmyflights.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.bookmyflights.Repository.FlightRepository;
import com.excelr.bookmyflights.model.Flight;

@Service 
public class FlightService {
	@Autowired
	FlightRepository repo;
	
	public String save (Flight f1) {
		repo.save(f1);
		return ("Flight Added with ID :"+f1.getFlightId());
	}

	public Flight getflightById(Flight id) {
		return repo.findById(id.getFlightId()).orElse(null);
	}
	
	public List<Flight>getflight(){
		return repo.findAll();
	}
	
	public String delete(Flight f1) {
		repo.delete(f1);
		return "Flight Deleted with ID :"+f1.getFlightId();
	}
}
