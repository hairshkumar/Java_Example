package com.example.javabasic.oopsconcept;

public class ConstructorEx {
	private String name;
	public ConstructorEx() {
		name="SuperMan";
		System.out.println("Inside No-Args Constructor");
	}
	public ConstructorEx(String name) {
		System.out.println("Inside Parameterized Constructor");
		this.name = name;
	}
	public void showName() {
		System.out.println(name);
	}	
	public static void main(String[] args) {
		ConstructorEx constructor1=new ConstructorEx();
		ConstructorEx constructor2=new ConstructorEx("BatMan");
		constructor1.showName();
		constructor2.showName();
	}
}