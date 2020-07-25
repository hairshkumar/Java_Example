package com.example.javabasic.ControlStatement;

public class SwitchExample {

	public static void main(String[] args) {
		String grade = "C";
		switch (grade) {
		case "C":
			System.out.println("mark is 35");
		case "B":
			System.out.println("mark is 70");
			break;
		case "A":
			System.out.println("mark is 80");
			break;
		default:
			break;
		}
	}
}