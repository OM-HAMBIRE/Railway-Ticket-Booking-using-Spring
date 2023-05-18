package com.javaProgram.ticketBooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="railway_ticket")
public class Railway {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	
	@Column(name="passagener_name")
	private String name;
	
	@Column(name="Source_station")
	private String from;
	
	@Column(name="Destation_station")
	private String to;
	
	@Column(name="Travel_Date")
	private Date date;
	
	@Column(name="email_id")
	private String email;
	
	public Integer getTicketid()
	{
		return ticketId;
	}
	
	public void setTicketid(Integer ticketId)
	{
		this.ticketId=ticketId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getfrom()
	{
		return from;
	}
	
	public void setfrom(String from)
	{
		this.from=from;
	}
	
	public String getto()
	{
		return to;
	}
	
	public void setto(String to)
	{
		this.to=to;
	}
	
	public Date getdate()
	{
		return date;
	}
	
	public void setdate(Date date)
	{
		this.date=date;
	}
	
	public String getemail()
	{
		return email;
	}
	
	public void setemail(String email)
	{
		this.email=email;
	}
	
	
	public Railway(String name,String from,String to,Date date,String email)
	{
		super();
		this.name=name;
		this.from=from;
		this.to=to;
		this.date=date;
		this.email=email;
	}
	
		
	public Railway() {
		
	}

	@Override
	public String toString()
	{
		return "ticketId="+ticketId+
				"passagenerName="+name+
				"SourceStation="+from+
				"DestationStation="+to+
				"TravelDate="+date+
				"emailid="+email;
	}
}
