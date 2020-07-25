package com.example.javabasic.datatype;

public class CharExample {

	public static void main(String[] args) {
	char firstletter='a';
	System.out.println("Char value = "+firstletter);
	System.out.println("is given value a number "+Character.isDigit(firstletter));
	System.out.println("is given value a letter "+Character.isLetter(firstletter));
	System.out.println("is given value a lowercase "+Character.isLowerCase(firstletter));
	}
}