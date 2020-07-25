package com.example.javabasic.arrays;

public class OneDimenArrayEx {

	public static void main(String[] args) {
		int numbers[] = new int[] { 1, 3, 5, 7, 9 };
		System.out.println("length = " + numbers.length);
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}