package com.xworkz.oops.inheritance;

public class metro extends train {
	public String name;
	public String electric;
	public byte noOftrain;
	public String digitalticekt;
	public String autoDoor;

	public metro()
	{
		System.out.println("invoking metro constructor");
	}
	
	public void time()
	{
		System.out.println("metro can reduse time bcz of its speed");
	}
	public void station()
	{
		System.out.println("area by area stations");
	}
}
