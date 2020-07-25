package com.example.javabasic.operator;

public class BitWiseOperatorExample {

	public static void main(String[] args) {
	int x=8;
	int y=5;
	System.out.println("Binary form of X == "+Integer.toBinaryString(x));
	System.out.println("Binary form of Y == "+Integer.toBinaryString(y));
	System.out.println("~x == "+~x);	
	System.out.println("x & y == "+(x&y));
	System.out.println("x | y == "+(x|y));
	System.out.println("x ^ y == "+(x^y));
	System.out.println("x >> y == "+(x>>2));
	System.out.println("x << y == "+(x<<2));
	}
}  