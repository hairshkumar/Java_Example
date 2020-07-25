package com.example.javabasic.exceptionhandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		String name = "Rock";
		try {
			try {
				char lastChar = name.charAt(name.length());
				System.out.println("Character " + lastChar);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("In Catch 1");
			}
			try {
				int number = Integer.parseInt(name);
				System.out.println("Number " + number);
			} catch (NumberFormatException e) {
				System.out.println("In Catch 2");
			}
		} catch (Exception e) {
			System.out.println("Inside main Catch");
		}
	}
}