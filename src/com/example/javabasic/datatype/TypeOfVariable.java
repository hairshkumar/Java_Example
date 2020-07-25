package com.example.javabasic.datatype;

public class TypeOfVariable {

	int instacevalue = 100; // instance variable
	static int staticvalue = 101; // static variable
	public static void main(String[] args) {
		int localvalue = 102;//local variable
		TypeOfVariable typeOfVariable=new TypeOfVariable();
		typeOfVariable.showInstance();		
		System.out.println("Static Variable value = " + staticvalue);
		System.out.println("Local Variable value = " + localvalue);
	}
	public void showInstance() {
		System.out.println("Instace Variable value = " + instacevalue);
	}
}