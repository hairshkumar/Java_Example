package com.example.javabasic.StringExample;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Super man");
		System.out.println("Length = "+buffer.length());
		System.out.println("ChatAt 0 = "+buffer.charAt(0));
		System.out.println("Index of m = "+buffer.indexOf("m"));
		System.out.println("Removing super = "+buffer.delete(0, 6));
		System.out.println("Inserting bat at beginning = "+buffer.insert(0, "bat"));
		System.out.println("Reversing = "+buffer.reverse());
	}
}