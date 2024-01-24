package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FlightRepository extends MongoRepository<Flight , UUID> {
}
