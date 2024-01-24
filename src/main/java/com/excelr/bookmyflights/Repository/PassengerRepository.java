package com.bookings.Repository;

import com.bookings.Entity.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PassengerRepository extends MongoRepository<Passenger, UUID> {
}
