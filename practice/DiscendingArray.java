package com.xworkz.practice;

public class DiscendingArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 7, 4, 5, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending order"); 
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
