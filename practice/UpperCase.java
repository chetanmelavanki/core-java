package com.xworkz.practice;

public class UpperCase {
	public static void main(String[] args) {
		String str="hi dinga";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if (ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}
}
