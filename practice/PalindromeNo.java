package com.xworkz.practice;

public class PalindromeNo {
	public static void main(String[] args) {
		int num = 12321, rev = 0, rem, temp = num;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("palindrome num");
		} else {
			System.out.println("not palindrome num");
		}
	}
}
