package com.example.javabasic.datatype;

public class TypeCastingExample1 {

	public static void main(String[] args) {
		byte b = 100;
		short s = 10000;
		int i = 1000000;
		System.out.println("Before Casting");
		System.out.println("b = " + b + " s = " + s + " i = " + i);
		System.out.println("After Casting");
		s=b; //byte to short
		i=s; //short to ing
		System.out.println("b = " + b + " s = " + s + " i = " + i);
	}
}