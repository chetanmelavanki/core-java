package com;

import com.xworkz.oops.encapsulation.flower;

public class flowerTester {
	public static void main(String []args)
	{
		flower flowe=new flower();
		
		flowe.setName("Hibiscus");
		System.out.println(flowe.getName());
		
		flowe.setStemen("1");
		System.out.println(flowe.getStamen());
		
		flowe.setAnther("4 to 5");
		System.out.println(flowe.getAnther());
		
		flowe.setFilament("4 to 5");
		System.out.println(flowe.getFilament());
		
		flowe.setOvary("1");
		System.out.println(flowe.getOvary());
		
		flowe.setOvul("1");
		System.out.println(flowe.getOvul());
		
		flowe.setPetal("4 to 6");
		System.out.println(flowe.getPetal());
		
		flowe.setPistill("4 parts=pistill");
		System.out.println(flowe.getPistill());
		
		flowe.setStigma("1");
		System.out.println(flowe.getStigma());
		
		flowe.setStyle("1");
		System.out.println(flowe.getStyle());
	}

}
