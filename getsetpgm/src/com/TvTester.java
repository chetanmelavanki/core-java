package com;

import com.xworkz.oops.encapsulation.Tv;

public class TvTester 
{
	public static void main(String []args)
	{
		Tv name=new Tv();
		
		String tv=name.getBrand();
		System.out.println(tv);
		
		name.setBrand("Samsung");
		String com=name.getBrand();
		System.out.println(com);
		
		
		name.setSize(44);
		int si=name.getSize();
		System.out.println(si);
		
	}
	
	
}
