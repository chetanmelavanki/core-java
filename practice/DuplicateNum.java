package com.xworkz.practice;

public class DuplicateNum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 7, 5, 4, 6, 2, 6, 5, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
