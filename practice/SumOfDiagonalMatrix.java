package com.xworkz.practice;

public class SumOfDiagonalMatrix {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sumOfDiagonal=0;
		System.out.println("original matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("after addition of diagonal elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==j) {
					sumOfDiagonal=sumOfDiagonal+a[i][j];
				}
			}
		}
		System.out.println(sumOfDiagonal);
	}
}
