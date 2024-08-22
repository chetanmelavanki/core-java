package com.xworkz.practice;

public class Fibbonacci {
	public static void main(String[] args) {
		int num = 5, firstTerm = 0, secondTerm = 1;

		for (int i = 1; i <= num; i++) {
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
