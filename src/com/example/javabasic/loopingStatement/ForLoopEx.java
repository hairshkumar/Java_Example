package com.example.javabasic.loopingStatement;

public class ForLoopEx {

	public static void main(String[] args) {
		int sum = 0;
		//sum of number for 0 to 4
		for (int i = 0; i < 5; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}