package com.xworkz.practice;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 6, sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum==num) {
			System.out.println("It is perfect number");
		} else {
			System.out.println("It is not perfect number");
		}
	}
}
