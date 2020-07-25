package com.example.javabasic.ControlStatement;

public class NestedIFEx {

	public static void main(String[] args) {
		int a = 50;
		if (a >= 30) {
			if (a == 40)
				System.out.println("a = 40");
			if (a == 50)
				System.out.println("a = 50");
		}
	}
}