package com.example.javabasic.oopsconcept;

public class Calculator {
	int number1;
	int number2;
	public Calculator() {
	}
	public Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public Calculator(int number1) {
		this.number1 = number1;
	}
	public void addNumbers() {
		System.out.println(number1+"+"+number2+"="+(number1+number2));
	}
	public static void main(String[] args) {
		Calculator calculator1=new Calculator();
		Calculator calculator2=new Calculator(2);
		Calculator calculator3=new Calculator(2,2);
		calculator1.addNumbers();
		calculator2.addNumbers();
		calculator3.addNumbers();
	}
}