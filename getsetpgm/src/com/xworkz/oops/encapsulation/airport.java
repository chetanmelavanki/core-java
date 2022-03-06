package com.xworkz.oops.encapsulation;

public class airport {
	private String company;
	private String ticketCounter;
	private double flightprice;
	private double ticketPrice;
	private String classType;
	private int passengers;
	private String luggageRoom;
	private String seatNo;
	private String toiletRoom;
	private boolean vaccinated;
	
	public airport()
	{
		
	}
	
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String com)
	{
		company=com;
	}
	
	public String getTicket()
	{
		return company ;
	}
	public void setTicket(String com)
	{
		
	}
	
	public String getCunter()
	{
		return ticketCounter;
	}
	public void setCounter(String tick)
	{
		ticketCounter=tick;
	}

	public double getflight()
	{
		return flightprice;
	}
	public void setflight(double price)
	{
		flightprice=price;
	}
	
	public double getTicket1()
	{
		return ticketPrice;
	}
	public void setTicket(double pric)
	{
		ticketPrice=pric;
	}
	
	public String getClasstype()
	{
		return classType;
	}
	public void setClasstype(String classty)
	{
		classType=classty;
	}
	
	public int getPassenger()
	{
		return passengers;
	}
	public void setPassenger(int pass)
	{
		passengers=pass;
	}
	
	public String getLuggage()
	{
		return luggageRoom;
	}
	public void setLuggage(String lugg)
	{
		luggageRoom=lugg;
	}
	
	public String getSeat()
	{
		return seatNo;
	}
	public void setSeat(String seatno)
	{
		seatNo=seatno;
	}
	
	public String getToilet()
	{
		return toiletRoom;
	}
	public void setToilet(String toilet)
	{
		toiletRoom=toilet;
	}
	
	public boolean getVAccinated()
	{
		return vaccinated;
	}
	public void setVaccine(boolean vaccine)
	{
		vaccinated=vaccine;
	}
	
}
