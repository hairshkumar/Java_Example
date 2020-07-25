package com.example.javabasic.arrays;

import java.util.Arrays;

public class ArrayMethodEx {

	public static void main(String[] args) {
		int number[] = new int[] { 6, 4, 2, 8, 1 };
		System.out.println("Before Sorting "+Arrays.toString(number));		
		Arrays.sort(number);
		System.out.println("After Sorting "+Arrays.toString(number));
		int foundindex = Arrays.binarySearch(number, 4);
		boolean isequal = Arrays.equals(number, new int[] { 1, 2, 4, 6, 8 });
		System.out.println("index of 4 " + foundindex);
		System.out.println("Array Equal " + isequal);
	}
}