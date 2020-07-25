package com.example.javabasic.loopingStatement;

public class ForEachLoopEx {

	public static void main(String[] args) {
		String name = "Superman";
		for (char letter : name.toCharArray()) {
			System.out.println(letter);
		}
	}
}