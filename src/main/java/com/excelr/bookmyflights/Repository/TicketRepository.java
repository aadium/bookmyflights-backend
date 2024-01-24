package com.bookings.Repository;

import com.bookings.Entity.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TicketRepository extends MongoRepository<Ticket , UUID> {
}
