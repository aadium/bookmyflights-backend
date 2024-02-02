package com.excelr.bookmyflights.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.bookmyflights.Service.PassengerService;
import com.excelr.bookmyflights.model.Passenger;

@RestController
@CrossOrigin
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	PassengerService service;

	@PostMapping("/savePassenger")
	public void savePassenger(@RequestBody Passenger P1) {
		service.save(P1);
	}

}
