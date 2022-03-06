package com;

import com.xworkz.oops.encapsulation.airport;

public class aiportTester {
	public static void main(String []args)
	{
		airport tick=new airport();
		
		tick.setClasstype("First class");
		System.out.println(tick.getClasstype());
		
		tick.setCompany("challenagers");
		System.out.println(tick.getCompany());
		
		tick.setCounter("bangalore");
		System.out.println(tick.getCunter());
		
		tick.setflight(21124.34);
		System.out.println(tick.getflight());
		
		tick.setLuggage("one passanger 30kg max");
		System.out.println(tick.getLuggage());
		
		tick.setPassenger(100);
		System.out.println(tick.getPassenger());
		
		tick.setSeat("120");
		System.out.println(tick.getSeat());
		
		tick.setTicket(213144.34);
		System.out.println(tick.getTicket());
		
		tick.setTicket("army");
		System.out.println(tick.getTicket1());
		
		tick.setToilet("yess");
		System.out.println(tick.getToilet());
		
		tick.setVaccine(true);
		System.out.println(tick.getVAccinated());
	}

}
