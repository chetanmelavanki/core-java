package com.xworkz.practice;

//public class MissingNumber {
//	public static void main(String[] args) {
//		int[] a = { 7, 5, 6, 1, 4, 2 };
//		int sum = 0;
//		for (int i = 0; i <= a.length + 1; i++) {
//			sum = sum + i;
//		}
//		for (int i = 0; i < a.length; i++) {
//			sum = sum - a[i];
//		}
//		System.out.println("missing number = " + sum);
//	}
//}
public class MissingNumber {
	public static void main(String[] args) {
		int[] a = { 7, 5, 6, 1, 4, 2 };
		int sum = ((a.length + 1) * (a.length + 2)) / 2;
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
		}
		System.out.println("missing number = " + sum);
	}
}