package com;

import com.xworkz.electronic.laptop;

public class laptopTester 
{
	public static void main(String []args)
	{
		laptop lap=new laptop("HP","hp slide 2","3rd series",7456874658l,69999.90,"hp megha bite",8,512,1000,"intel 5");
		laptop lapt=new laptop("DELL","inspirom","4th series",7765765438l,79999.90,"Dell latest",8,512,1000,"intel 3");
		laptop lapto=new laptop("ASUS","asus rog gaming","9th genearation",987854658l,89999.90,"asus rog",8,512,1000,"intel 7");
		
		lap.capacity();
		lap.charger();
		lap.gaming();
		lap.performace();
		lap.storage();
	}
}
