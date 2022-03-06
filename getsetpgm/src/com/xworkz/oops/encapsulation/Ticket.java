package com.xworkz.oops.encapsulation;

public class Ticket 
{
	private String name;
	private String adress;
	private short date;
	private String from;
	private int trainNo;
	private String to;
	private String classtype;
	private String qouta;
	private String ticketType;
	private boolean gender;

	
	public Ticket()
	{
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String namee)
	{
		name=namee;
	}
	
	
	public String getAdress()
	{
		return adress;
	}
	public void setAdress(String adres)
	{
		adress=adres;
	}
	
	public short getDate()
	{
		return date;
	}
	public void setDate(short dat)
	
	{
		date=dat;
	}
	
	public String getFrom()
	{
		return from;
	}
	public void setFrom(String fro) 
	{
		from=fro;
	}
	
	public int getTrain()
	{
		return trainNo;
	}
	public void setTrain(int tran)
	{
		trainNo=tran;
	}
	public String getTo()
	{
		return to;
	}
	public void setTo(String too)
	{
		to=too;
	}
	
	public  String getClasstyp()
	{
		return classtype;
	}
	
	public void setClass(String classty)
	{
		classtype=classty;
	}
	
	public String getQuota()
	{
		return qouta;
	}
	public void setQuota(String qout)
	{
		qouta=qout;
	}
	public String getTicket()
	{
		return ticketType;
	}
	public void setTicket(String ticket)
	{
		ticketType=ticket;
	}
	public boolean getGender()
	{
		return gender;
	}
	public void setGender(boolean gende) 
	{
		gender=gende;
	}
	
	
	
	
	
	
	
	
	
	
}

