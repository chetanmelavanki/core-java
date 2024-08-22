package com.xworkz.practice;

public class LowestOrMinimum {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 2, 1, -1, 20 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}
}
