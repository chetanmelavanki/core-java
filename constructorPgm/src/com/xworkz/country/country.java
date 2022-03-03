package com.xworkz.country;

public class country 
{
	public String country;
	public String Language;
	public String capital;
	public long population;
	public int states;
	public String pm;
	public boolean army;
	public String famousPlace;
	public double  gst;
	public double gdp;
	

	public country(String a,String b, String c,long d,int e,String f,boolean m,String g,double h,double i)
	{
		country=a;
		Language=b;
		capital=c;
		population=d;
		states=e;
		pm=f;
		army=m;
		famousPlace=g;
		gst=h;
		gdp=i;
		
		System.out.println(country+"\t"+Language+"\t"+capital+"\t"+population+"\t"+states+"\t"+pm+"\t"+army+"\t"+famousPlace+"\t"+gst+"\t"+gdp);
		
	}
	
	
	public void india()
	{
		System.out.println("Invoking India Constructor");	
		
	}
	
	public void currency()
	{
		System.out.println("Rupees");
	}
	
	public void famousDish()
	{
		System.out.println("Masala Dosa");
	}
	
	public void famousDress()
	{
		System.out.println("Indian Saree");
	}
	
	public void famousFlower()
	{
		System.out.println("Lotus");
	}
}


