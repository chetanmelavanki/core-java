package com;

import com.xworkz.motorCycle.bikes;

public class bikeTester 
{
	public static void main(String []args)
	{
	bikes bike=new bikes("fz","Yamaha",3.0,150000.99,"Tubeless","black & white",2,10.2,"plastic body",2);
	bikes bi=new bikes("ns200","bajaj",2.0,139000.99,"Tubeless","blue",2,11.2,"plastic body",2);
	bikes bie=new bikes("duke","KTM",1.0,267000.99,"Tubeless","maroon",2,15.0,"plastic body",2);
	
	bike.condition();
	bike.maxSpeed();
	bike.mileage();
	bike.performance();
	bike.weight();
	
	}
	
}
