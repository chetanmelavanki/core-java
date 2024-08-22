package com.xworkz.practice;

import java.util.ArrayList;

public class CollectionReverse {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("a");
		a.add("b");
		a.add("c");
		System.out.println(a);
		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.println(a.get(i));
		}
	}
}
