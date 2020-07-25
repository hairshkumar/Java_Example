package com.example.javabasic.datatype;

public class TypeCastingExample2 {

	public static void main(String[] args) {
		byte b = 100;
		short s = 100;
		int i = 124; 
		System.out.println("Before Casting");
		System.out.println("b = " + b + " s = " + s + " i = " + i);
		System.out.println("After Casting");
		s = (short) i;// int to short
		b = (byte) s;// short to int
		System.out.println("b = " + b + " s = " + s + " i = " + i);
	}
}