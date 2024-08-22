package com.xworkz.practice;

public class ArraySwapWithout3rdVar {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		a[0]=a[0]+a[2];
		a[2]=a[0]-a[2];
		a[0]=a[0]-a[2];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
