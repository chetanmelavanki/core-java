package com;

import com.xworkz.movie.movie;

public class movieTester 
{
	public static void main(String []args)
	{
		movie film=new movie("KGF","prashant neel","manjanna","reddy",10,5000000,150,"nityanand","YASH","Radhika Pandit");
		
		movie fil=new movie("Robot","ranveer","chikkana","ramya",8,200000,120,"ganesh","darshan","Rashmika Mandan");
		
		movie films=new movie("sanam","ravi","labodara","arjun",7,150000,100,"pradeep","Puneet rajkumar","Aditya prabhudevan");
	
		film.audienceRespose();
		film.days();
		film.intermission();
		film.movieStory();
		film.publication();
	}
}
