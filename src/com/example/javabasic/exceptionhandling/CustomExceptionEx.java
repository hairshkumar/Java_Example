package com.example.javabasic.exceptionhandling;

public class CustomExceptionEx {

	public static void checkMail(String mail) throws InvalidMailFormat {
		if (!mail.endsWith("gmail.com"))
			throw new InvalidMailFormat("invali mail format");
		else
			System.out.println("Valid mail");
	}

	public static void main(String[] args) {
		try {
			checkMail("mymailid122@");
		} catch (InvalidMailFormat e) {
			System.out.println("Inside Catch block");
			System.out.println(e.getErrorMsg());
		}
	}
}