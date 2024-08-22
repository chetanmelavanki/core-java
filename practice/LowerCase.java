package com.xworkz.practice;

public class LowerCase {
	public static void main(String[] args) {
		String str = "HI GOOGLE";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 'A' && ch[i] < 'Z') {
				ch[i] = (char) (ch[i]+32);
			}
			System.out.print(ch[i]);
		}
	}
}
