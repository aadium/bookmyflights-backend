package com.excelr.bookmyflights.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.bookmyflights.Repository.PassengerRepository;
import com.excelr.bookmyflights.model.Passenger;

@Service
public class PassengerService {
	@Autowired
	PassengerRepository repo;

	public String save(Passenger p1) {
		repo.save(p1);
		return ("Passanger Added with ID:" +p1.getId());
	}
}
