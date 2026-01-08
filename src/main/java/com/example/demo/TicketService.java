package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	                  //reference of repository
	@Autowired
	private TicketRepo ticketrepo;
	
	public Ticket createticket(Ticket ticketobj){
		return ticketrepo.save(ticketobj);
	}
	
	public Iterable<Ticket> Getalltickets(){
		return ticketrepo.findAll();
	}
	
	public Ticket Getticket(Integer ticketId) {
		return ticketrepo.findById(ticketId).orElse(new Ticket());
	}
	
	public void DeleteTicket(Integer ticketId) {
		ticketrepo.deleteById(ticketId);
	}
	public Ticket UpdateTicket(Integer ticketId,Ticket newTicketData) {
		Ticket existingTicket = ticketrepo.findById(ticketId).orElse(null);
		
		if(existingTicket != null) {
			existingTicket.setPassengername(newTicketData.getPassengername());
			existingTicket.setSourcestation(newTicketData.getSourcestation());
			existingTicket.setDestinationstation(newTicketData.getDestinationstation());
			existingTicket.setEmail(newTicketData.getEmail());
			return ticketrepo.save(existingTicket);
			
		}
		return null;
		
		
	}


}
