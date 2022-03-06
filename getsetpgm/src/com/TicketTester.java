package com;

import com.xworkz.oops.encapsulation.Ticket;

public class TicketTester 
{
	public static void main(String []args) 
	{
		Ticket ticket=new Ticket();
		
		ticket.setName("nikunj");
		System.out.println(ticket.getName());
		
		
		ticket.setAdress("Navanagar");
		System.out.println(ticket.getAdress());
		
		ticket.setDate((short) 15);
		System.out.println(ticket.getDate());
	
		ticket.setFrom("bangalore");
		System.out.println(ticket.getFrom());
	
		ticket.setTrain(143);
		System.out.println(ticket.getTrain());
		
		ticket.setTo("bgk");
		System.out.println(ticket.getTo());
		
		ticket.setClass("second classs");
		System.out.println(ticket.getClass());
		
		ticket.setQuota("army");
		System.out.println(ticket.getQuota());
		
		ticket.setGender(true);
		System.out.println(ticket.getGender());
		
		ticket.setTicket("standard");
		System.out.println(ticket.getTicket());
	}
}
