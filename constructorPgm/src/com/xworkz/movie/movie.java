package com.xworkz.movie;

public class movie 
{
	public String name;
	public String producer;
	public String coproducer;
	public String composer;
	public double rating;
	public double estimation;
	public int ticketPrice;
	public String scriptWriter;
	public String hero;
	public String heroin;

	public movie(String a,String b,String c ,String d,double e,double f,int g,String h,String i,String j)
	{
		name=a;
		producer=b;
		coproducer=c;
		composer=d;
		rating=e;
		estimation=f;
		ticketPrice=g;
		scriptWriter=h;
		hero=i;
		heroin=j;
		
		System.out.println(name+"\t"+producer+"\t"+coproducer+"\t"+composer+"\t"+rating+"\t"+estimation+"\t"+ticketPrice+"\t"+scriptWriter+"\t"+hero+"\t"+heroin);
	}
	
	public void movieStory()
	{
		System.out.println("love story");
	}
	public void publication()
	{
		System.out.println("all over india");
	}
	public void audienceRespose()
	{
		System.out.println("super");
	}
	public void days()
	{
		System.out.println("100days running successfully");
	}
	public void intermission()
	{
		System.out.println("one intermission");
	}

}

