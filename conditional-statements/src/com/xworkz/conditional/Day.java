package com.xworkz.conditional;

public class Day {
	public static void main(String[] args) {
		int day=9;
		
		if (day==1) {
			System.out.println("Sunday Funday");
		}
		if (day==2) {
			System.out.println("Monday");
		}
		if (day==3) {
			System.out.println("Tuesday");
		}
		if (day==4) {
			System.out.println("Wednesday");
		}
		if (day==5) {
			System.out.println("Thursday");
		}
		if (day==6) {
			System.out.println("Friday");
		}
		if (day==7) {
			System.out.println("Saturday");
		}
		if (day>7) {
			System.out.println("please enter a valid number");
		}
	}

}
