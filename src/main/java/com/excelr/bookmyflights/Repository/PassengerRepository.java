package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PassengerRepository extends MongoRepository<Passenger, UUID> {
}
