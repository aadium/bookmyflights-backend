package com.excelr.bookmyflights.Repository;

import com.excelr.bookmyflights.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket , String> {
}
