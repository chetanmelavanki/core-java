package com.xworkz.practice;

public class Highest {
	public static void main(String[] args) {
		int arr[] = { 100, 1, 2, 3, 45, 6, 78, 90, 101 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
