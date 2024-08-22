package com.xworkz.practice;

public class StringSwap {
	public static void main(String[] args) {
		String a="123";
		String b="abc";
		System.out.println("before swaping a="+a +" b="+b);
		String temp=a;
		a=b;
		b=temp;
		System.out.println("after swaping  a="+a+" b="+b);
	}
}
