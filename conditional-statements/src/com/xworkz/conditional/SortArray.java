package com.xworkz.conditional;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		
		int [] arr1={1,74,34,23,12,19,20,39,26,8738,22};
		Arrays.sort(arr1);
		System.out.println("sorting array in acsending order"+Arrays.toString(arr1));
		
		Integer [] arr={1,74,34,23,12,19,20,39,26,8738,22};
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("sorting array in decending order"+Arrays.toString(arr));
		
	}

}
