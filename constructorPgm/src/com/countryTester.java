package com;

import com.xworkz.country.country;

public class countryTester 
{
	public static void main(String []args)
	{
		country count=new country("India","Kannada & Hindi","Delhi",67576567546l,32,"Modi",true,"RED PORT",16.5,344565.44444);
	
		country coun=new country("america","English","Washington",6565677546l,38,"joe bidan",false,"san fransisco",15.6,12365.44444);
		
		country cou=new country("pak","Hindi","islamabad",42324246l,20,"imran khan",true,"Deosai National Park",20.5,8574565.44444);
		
		count.currency();
		count.famousDish();
		count.famousDress();
		count.famousFlower();
		count.india();
	}
}
