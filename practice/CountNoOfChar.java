package com.xworkz.practice;

public class CountNoOfChar {
	public static void main(String[] args) {
		String str="hi java";
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(str+"="+count);
	}
}
