package com.xworkz.practice;

public class StringReverse {
	public static void main(String[] args) {
		String s="chetan";
		char[] arr=s.toCharArray();
		
		String strRev="";
		for(int i=arr.length-1;i>=0;i--) {
			strRev=strRev+arr[i];

			System.out.println(strRev);
		}
		
	}
}
//public class StringReverse {
//	public static void main(String[] args) {
//		String s="chetan";
//		char[] arr=s.toCharArray();
//		
//		String strRev="";
//		
//		String str="";
//		for (int i = 0; i < arr.length; i++) {
//			str=str+arr[i];
//			System.out.println(str);
//		}
//	}
//}
//public class StringReverse {
//	public static void main(String[] args) {
//		String s="chetan";
//		char[] arr=s.toCharArray();
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}
//		
//	}
//}