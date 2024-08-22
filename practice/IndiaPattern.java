package com.xworkz.practice;

public class IndiaPattern {
	public static void main(String[] args) {
		String str = "INDIA";
		char ch[] = str.toCharArray();
		int end = 5;
		for (int i = 0; i <= ch.length - 1; i++) {
			for (int j = end - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
