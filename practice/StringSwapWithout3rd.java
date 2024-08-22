package com.xworkz.practice;

public class StringSwapWithout3rd {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "1234";
		System.out.println("a=" + a + " b=" + b);
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("a=" + a + " b=" + b);
	}
}
