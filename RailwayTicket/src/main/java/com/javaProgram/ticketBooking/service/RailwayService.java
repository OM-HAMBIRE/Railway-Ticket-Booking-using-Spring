package com.javaProgram.ticketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaProgram.ticketBooking.dao.RailwayDao;
import com.javaProgram.ticketBooking.model.Railway;

@Service
public class RailwayService 
{

	@Autowired
	private RailwayDao railwayDao;
	
	//find all
	public Iterable<Railway> getAllTickets()
	{
		return railwayDao.findAll();
	}
	
	//find single
	public Railway getTicket(Integer Obj)
	{
		return railwayDao.findById(Obj)
				.orElse(new Railway());
	}
	
	//create ticket
	public Railway create(Railway Obj)
	{
		return railwayDao.save(Obj);
	}
	
	//update ticket
	public Railway update(Integer ticketIdObj,String newemail)
	{
		Railway railwayObj=getTicket(ticketIdObj);
		railwayObj.setemail(newemail);
		return railwayDao.save(railwayObj);
		
	}
	
	//delete ticket
	
	public void delete(Integer Obj)
	{
		railwayDao.deleteById(Obj);
	}
	
	
}
