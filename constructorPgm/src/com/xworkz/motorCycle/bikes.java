package com.xworkz.motorCycle;

public class bikes 
{
	public String name ;
	public String company;
	public double version;
	public double price;
	public String tyre;
	public String color;
	public int wheel;
	public double petrolTank;
	public String bodyType;
	public int seats;
	
	public bikes(String a,String b,double c,double d,String e,String f,int g,double h,String i,int j)
	{
		name=a;
		company=b;
		version=c;
		price=d;
		tyre=e;
		color=f;
		wheel=g;
		petrolTank=h;
		bodyType=i;
		seats=j;
		
		System.out.println(name+"\t"+company+"\t"+version+"\t"+price+"\t"+tyre+"\t"+color+"\t"+wheel+"\t"+petrolTank+"\t"+bodyType+"\t"+seats);	
		}
	public void performance()
	{
		System.out.println("Good Performance");
	}
	
	public void mileage()
	{
		System.out.println("it gives 50kmph");
	}
	
	public void weight()
	{
		System.out.println("150kg");
	}
	
	public void maxSpeed()
	{
		System.out.println("120");
	}
	
	public void condition()
	{
		System.out.println("new one");
	}
}
