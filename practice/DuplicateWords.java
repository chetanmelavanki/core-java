package com.xworkz.practice;

public class DuplicateWords {
	public static void main(String[] args) {
		String a = "big black bug bit a big black dog on his big black nose";

		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					count++;
					b[j]="0";
				}
			}
			if (count>1 && b[i]!="0") {
				System.out.println(b[i]);
			}
		}
	}
}
