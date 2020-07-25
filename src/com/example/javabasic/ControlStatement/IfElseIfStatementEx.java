package com.example.javabasic.ControlStatement;

public class IfElseIfStatementEx {

	public static void main(String[] args) {
		int mark = 80;
		String grade;
		if (mark <= 35)
			grade = "C";
		else if (mark <= 75)
			grade = "B";
		else
			grade = "A";
		System.out.println("Grade = " + grade);
	}
}