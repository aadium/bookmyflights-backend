package com.bookings.Repository;

import com.bookings.Entity.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FlightRepository extends MongoRepository<Flight , UUID> {
}
