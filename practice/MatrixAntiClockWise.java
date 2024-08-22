package com.xworkz.practice;

public class MatrixAntiClockWise {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("original matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("after rotating anti clock wise");
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
