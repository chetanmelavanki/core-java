package com.xworkz.practice;

import java.util.ArrayList;

public class StringArryToArrayList {
	public static void main(String[] args) {
		String str[] = { "java", "is", "object" };

		ArrayList arrayList = new ArrayList<>();
		for (String s : str) {
			arrayList.add(s);
		}
		System.out.println(arrayList);
	}
}
