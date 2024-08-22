package com.xworkz.practice;

public class CountWords {
	public static void main(String[] args) {
		String str = "hi good morning all";
		int count=0;
		
		String s[]=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
