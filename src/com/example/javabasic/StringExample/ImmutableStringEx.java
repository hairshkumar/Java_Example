package com.example.javabasic.StringExample;

public class ImmutableStringEx {

	public static void main(String[] args) {
		String s="Sachin";  
		System.out.println(Integer.toHexString(s.hashCode()));
		s=s.concat(" Tendulkar");  
		System.out.println(s); 
		System.out.println(Integer.toHexString(s.hashCode()));
		}
}