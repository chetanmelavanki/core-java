package com.xworkz.practice;

public class QoutientAndReminder {
	public static void main(String[] args) {

		int quotient, reminder;
		double numerator = 20, denominator = 2;

		quotient = (int) (numerator / denominator);

		reminder = (int) (numerator % denominator);

		System.out.println("quotient = " + quotient);
		System.out.println("reminder = " + reminder);
	}
}
