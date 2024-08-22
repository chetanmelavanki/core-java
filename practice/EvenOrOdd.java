package com.xworkz.practice;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 45, 5, 6, 9, 10 };

		System.out.println("even numbers");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("odd numbers");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
	}
}
