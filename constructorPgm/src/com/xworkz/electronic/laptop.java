package com.xworkz.electronic;

public class laptop 
{
	public String company;
	public String name;
	public String Series;
	public long serialNo;
	public double price;
	public String model;
	public int ram;
	public int ssd;
	public int hdd;
	public String intel;
	
	public laptop(String a,String b,String c,long d,double e,String f,int g,int h, int i,String j)
	{
		company=a;
		name=b;
		Series=c;
		serialNo=d;
		price=e;
		model=f;
		ram=g;
		ssd=h;
		hdd=i;
		intel=j;
		
		System.out.println(company+"\t"+name+"\t"+Series+"\t"+serialNo+"\t"+price+"\t"+model+"\t"+ram+"\t"+ssd+"\t"+hdd+"\t"+intel);
		
		
	}
	
	public void performace()
	{
		System.out.println("Superb performace");
	}
	
	public void capacity()
	{
		System.out.println("it will work for upto8hs");
	}
	
	public void storage()
	{
		System.out.println("it will store the data");
	}
	public  void gaming()
	{
		System.out.println("it is not gaming laptop");
	}
	public void charger()
	{
		System.out.println("yes, 150vatt charger case available");
	}
}
