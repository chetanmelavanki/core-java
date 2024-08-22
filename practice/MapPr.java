package com.xworkz.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPr {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "a");
		hashMap.put(2, "b");
		hashMap.put(4, "c");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
