package com.xworkz.practice;

public class SecondLowest {
	public static void main(String[] args) {
		int num[] = { 10, 20, 3, 4, 5, 0, -1 };

		int lowest = num[0];
		int secLowest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < lowest) {
				secLowest = lowest;
				lowest = num[i];
			}
			if (num[i] < lowest && num[i] > secLowest) {
				secLowest = num[i];
			}
		}
		System.out.println("second lowest = " + secLowest);
	}
}
