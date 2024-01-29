package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightRepository extends MongoRepository<Flight , String> {
}
