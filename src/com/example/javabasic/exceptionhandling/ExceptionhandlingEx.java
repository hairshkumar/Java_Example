package com.example.javabasic.exceptionhandling;

public class ExceptionhandlingEx {

	public static void main(String[] args) {
		int[] number = { 1, 2, 4, 6, 8, 10 };
		int size = number.length;
		System.out.println("ArraySize = " + size);
		
		try {
			System.out.println("inside Try block");
			// below line will throw exception
			int lastEle = number[size];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inside Catch block");
		} finally {
			System.out.println("Inside finally block");
		}
	}
}