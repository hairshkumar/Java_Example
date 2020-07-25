package com.example.javabasic.datatype;

public class StaticAndFinalExample {
	static String myName = "BharathKumar";
	// final Method
	final void display() {
		System.out.println("I am final Method");
	}
	public static void main(String[] args) {
		StaticAndFinalExample example = new StaticAndFinalExample();
		final int id = 1001; // cannot change its value
		System.out.println("id = " + id);
		System.out.println("name = " + myName);
		System.out.println("calling final method");
		example.display();
	}
}