package com.xworkz.practice;

public class PrimeInArry {
	public static void main(String[] args) {
		int a[] = { 1, 2, 34, 5, 6, 7, 77, 8, 11, 37, 17 ,9,13};
		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			flag = true;
			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {			
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
