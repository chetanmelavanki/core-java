package com.xworkz.conditional;

public class Fibonacciapp {
	public static void main(String[] args) {
		int count=12,n1=0,n2=1,next;
		
		for(int i=1;i<=count;i++)
		{
			System.out.print(n1+",");
			
			next=n1+n2;
			n1=n2;
			n2=next;
			
			
			
		}
		
	} 
}
