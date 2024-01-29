package com.excelr.bookmyflights.Service;

import java.util.List;
import java.util.Optional;

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

	public void decrementSeats(Flight f1) {
		Optional<Flight> flightOpt = repo.findById(f1.getFlightId());
		if (flightOpt.isPresent()) {
			Flight existingFlight = flightOpt.get();
			existingFlight.setSeatsAvailable(existingFlight.getSeatsAvailable() - 1);
			repo.save(existingFlight);
		}
	}

	public String update(Flight f1) {
		Optional<Flight> flightOpt = repo.findById(f1.getFlightId());
		if (flightOpt.isPresent()) {
			Flight existingFlight = flightOpt.get();

			if (f1.getAirlines() != null) {
				existingFlight.setAirlines(f1.getAirlines());
			}
			if (f1.getFlightNumbers() != null) {
				existingFlight.setFlightNumbers(f1.getFlightNumbers());
			}
			if (f1.getFlightDurations() != null) {
				existingFlight.setFlightDurations(f1.getFlightDurations());
			}
			if (f1.getSource() != null) {
				existingFlight.setSource(f1.getSource());
			}
			if (f1.getDestination() != null) {
				existingFlight.setDestination(f1.getDestination());
			}
			if (f1.getDepartureTime() != null) {
				existingFlight.setDepartureTime(f1.getDepartureTime());
			}
			if (f1.getArrivalTime() != null) {
				existingFlight.setArrivalTime(f1.getArrivalTime());
			}
			if (f1.getSeatsAvailable() != 0) {
				existingFlight.setSeatsAvailable(f1.getSeatsAvailable());
			}
			if (f1.getLayovers() != null) {
				existingFlight.setLayovers(f1.getLayovers());
			}
			if (f1.getLayoverDurations() != null) {
				existingFlight.setLayoverDurations(f1.getLayoverDurations());
			}

			repo.save(existingFlight);
			return "Flight updated with ID :" + f1.getFlightId();
		} else {
			return "Flight not found with ID :" + f1.getFlightId();
		}
	}
}
