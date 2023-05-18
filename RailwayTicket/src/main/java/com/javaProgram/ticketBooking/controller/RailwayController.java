package com.javaProgram.ticketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaProgram.ticketBooking.model.Railway;
import com.javaProgram.ticketBooking.service.RailwayService;

@RestController
@RequestMapping(value="/")
public class RailwayController 
{
	@Autowired
	private RailwayService railwayService;
	
	
	@GetMapping(value="/all")
	public Iterable <Railway> getAllTickets()
	{
		return railwayService.getAllTickets();
	}
	
	@GetMapping(value="/{ticketId}")
	public Railway getTicket(@PathVariable("ticketId") Integer ticketId)
	{
		return railwayService.getTicket(ticketId);
	}
	
	@PostMapping(value="/create")
	public Railway createTicket(@RequestBody Railway Obj)
	{
		return railwayService.create(Obj);
	}
	
	
	@PutMapping(value= "/{ticketId}/{newemail}")
	public Railway updateTicket(@PathVariable("ticketId") Integer ticketId, 
								@PathVariable("newemail")String email)
	{
		return railwayService.update(ticketId, email);
	}
	
	@DeleteMapping(value="/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		railwayService.delete(ticketId);
	}
	
}
