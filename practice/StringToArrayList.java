package com.xworkz.practice;

import java.util.ArrayList;

public class StringToArrayList {
	public static void main(String[] args) {
		String name="Xworkz";

		ArrayList arrayList=new ArrayList<>();
		arrayList.add(name);
		System.out.println(arrayList);
	}
}

//		String name[]= {"java","c","c++"};

//		ArrayList arrayList=new ArrayList<>();
//		for (String str : name) {
//			arrayList.add(str);
//		}
//		System.out.println(arrayList);
//		for(Object obg :arrayList) {
//			System.out.println(obg);
//		}