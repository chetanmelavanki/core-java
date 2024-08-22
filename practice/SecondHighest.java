package com.xworkz.practice;

public class SecondHighest {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,32,34};
		int highest=a[0];
		int secHighest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>highest) {
				secHighest=highest;
				highest=a[i];
			}
			if (a[i]>highest && a[i]<secHighest) {
				secHighest=a[i];
			}
		}
		System.out.println(secHighest);
	}
}
