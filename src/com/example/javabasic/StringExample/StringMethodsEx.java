package com.example.javabasic.StringExample;

import java.util.Arrays;

public class StringMethodsEx {

	public static void main(String[] args) {
		String name="Super man";
		System.out.println("name = "+name);
		System.out.println("length of name = "+name.length());
		System.out.println("Is name empty = "+name.isEmpty());
		System.out.println("Converting String to lower and upper case");
		System.out.println("To LowerCase name = "+name.toLowerCase());
		System.out.println("To UpperCase name = "+name.toUpperCase());
		System.out.println("String Comparison");
		System.out.println("Do superman contain man = "+name.contains("man"));
		System.out.println("Do superman ends with man = "+name.endsWith("super"));
		System.out.println("Do superman start with man = "+name.startsWith("super"));
		System.out.println("Super man equals super man = "+name.equals("super man"));
		System.out.println("Super man equalsIgnorecase super man = "+name.equalsIgnoreCase("super man"));
		name=name.replace("Super", "Bat");
		System.out.println("Replacing Super with Bat= "+name);		
		System.out.println("Searchin leter in String");
		System.out.println("First occurrance of a in Bat man = "+name.indexOf("a"));
		System.out.println("First occurrance of a in Bat man = "+name.lastIndexOf("a"));
		System.out.println("Substring of bat man = "+name.substring(0,3));
		System.out.println("Spliting name = "+Arrays.toString(name.split(" ")));
	}
}