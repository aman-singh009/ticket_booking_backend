package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                                       //entity class, primary key data type
public interface TicketRepo extends CrudRepository<Ticket, Integer>{

}
