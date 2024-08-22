package com.xworkz.practice;

public class CopyArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 45, 6, 8 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		System.out.println("elements of 1st array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("elements of 2nd array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
