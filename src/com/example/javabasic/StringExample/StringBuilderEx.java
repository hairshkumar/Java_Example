package com.example.javabasic.StringExample;

public class StringBuilderEx {

	public static void main(String[] args) {
	StringBuilder stringBuilder=new StringBuilder("Super man");
	
	System.out.println("Length = "+stringBuilder.length());
	System.out.println("Char At 0 = "+stringBuilder.charAt(0));
	System.out.println("Appending Batman = "+stringBuilder.append("Bat Man"));
	System.out.println("Removing Superman = "+stringBuilder.delete(0, 9));
	System.out.println("Reverse = "+stringBuilder.reverse());
	}
}