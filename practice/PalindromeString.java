package com.xworkz.practice;

public class PalindromeString {
	public static void main(String[] args) {
		String original = "gadag";
		String rev = "";

		for (int i =original.length()-1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		if (original.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}
}
