package com.example.javabasic.oopsconcept;

public class OOPSExample {

	String title="OOPS Example";
	String message="OOPS is based on class and object";
	
	public void showMessage() {
		System.out.println(message);
	}

	public static void main(String[] args) {
		OOPSExample example=new OOPSExample();
		System.out.println(example.title);
		example.showMessage();
	}
}