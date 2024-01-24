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
	public List<Flight>getflight(){
		return repo.findAll();
	}
	

}
