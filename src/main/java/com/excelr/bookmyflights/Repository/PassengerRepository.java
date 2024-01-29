package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassengerRepository extends MongoRepository<Passenger, String> {
}
