package com.xworkz.practice;

public class ArmStrong {

	public static void main(String[] args) {
		int num = 371, rem, temp = num, sum = 0;

		while (num != 0) {
			rem = num % 10;
			sum = sum + rem * rem * rem ;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("armstrong num");
		} else {
			System.out.println("not armstrong num");
		}
	}

}
