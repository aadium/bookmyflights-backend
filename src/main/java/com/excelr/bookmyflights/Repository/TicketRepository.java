package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TicketRepository extends MongoRepository<Ticket , UUID> {
}
