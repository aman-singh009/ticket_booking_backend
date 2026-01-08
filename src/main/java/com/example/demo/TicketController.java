package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
@CrossOrigin(origins = "*")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket) {
        return ticketService.createticket(ticket);
    }

    @GetMapping
    public Iterable<Ticket> getAll() {
        return ticketService.Getalltickets();
    }

    @GetMapping("/{id}")
    public Ticket getById(@PathVariable Integer id) {
        return ticketService.Getticket(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        ticketService.DeleteTicket(id);
    }

    @PutMapping("/{id}")
    public Ticket update(@PathVariable Integer id,
                         @RequestBody Ticket ticket) {
        return ticketService.UpdateTicket(id, ticket);
    }
}
