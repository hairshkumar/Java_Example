package com.example.javabasic.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		String name = "Bharath";
		try {
			System.out.println("Inside try block");
			name.charAt(name.length());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Inside catch block 1 "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside catch block 2"+e.getMessage());
		}
	}
}