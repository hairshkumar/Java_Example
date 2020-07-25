package com.example.javabasic.oopsconcept;

public class MethodsExample {

	public void showName(String name) {
		System.out.println("Hellow " + name);
	}

	public String concatName(String name) {
		return "Welcome ".concat(name);
	}

	public static void showStatic() {
		System.out.println("Inside Static Method");
	}
	
	public void showWelcome() {
		System.out.println("Method Types Example");
	}

	public static void main(String[] args) {
		MethodsExample example = new MethodsExample();
		example.showWelcome();
		example.showName("User");
		System.out.println(example.concatName("Jack"));
		//calling static methods
		MethodsExample.showStatic();
	}
}