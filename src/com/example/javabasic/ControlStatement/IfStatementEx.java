package com.example.javabasic.ControlStatement;

public class IfStatementEx {

	public static void main(String[] args) {
		String name = "jack";
		if (name == "jack")
			System.out.println("Name equal jack");
		// below line will not be print as if statement is false
		if (name == "JackSparrow")
			System.out.println("Name equal jackSparrow");
	}
}