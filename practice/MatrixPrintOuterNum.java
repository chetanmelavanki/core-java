package com.xworkz.practice;

public class MatrixPrintOuterNum {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("original matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("after");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==0 || j==0 || i==a.length-1 || j==a.length-1) {
					System.out.print(a[i][j]+" ");
				}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}
}
