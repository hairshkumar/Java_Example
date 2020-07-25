package com.example.javabasic.datatype;

public class StaticBlockExample {
	static int id;// value is not assgined here
	static {
		System.out.println("inside Static block");
		id = 1111;// value is assigned here
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		System.out.println("id = " + id);
	}
}