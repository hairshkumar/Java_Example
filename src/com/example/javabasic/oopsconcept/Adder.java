package com.example.javabasic.oopsconcept;

public class Adder {

	public int add(int num1,int num2) {
		return num1+num2;
	}
	public float add(float num1,float num2) {
		return num1+num2;
	}
	public double add(double num1,double num2) {
		return num1+num2;
	}
	public long add(long num1,long num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
	Adder adder=new Adder();
	System.out.println(adder.add(1, 2));	
	System.out.println(adder.add(1.11111, 2.22222));	
	System.out.println(adder.add(1.11, 2.22));	
	System.out.println(adder.add(1111L,2222L));	
	}
}