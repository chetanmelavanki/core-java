package com.xworkz.practice;

public class IntetchangeMatrixElements {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("original matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("after interchange");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int temp=a[i][j];
				a[i][j]=a[a.length-1][j];
				a[a.length-1][j]=temp;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
