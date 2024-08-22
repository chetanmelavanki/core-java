package com.xworkz.practice;

public class ArraySwapUsing3rdVar {

	public static void main(String[] args) {
		int arr[]= {10,20};
		
		System.out.println("before swaping array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1] = temp;

		System.out.println("after swaping array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
