package com.example.javabasic.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String args[]) {
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("SuperMan");
		linkedSet.add("BatMan");
		linkedSet.add("AquaMan");
		System.out.println(linkedSet);
		System.out.println("Adding duplicate value BatMan");
		linkedSet.add("BatMan");
		System.out.println(linkedSet);
		System.out.println("Removing SuperMan");
		linkedSet.remove("SuperMan");
		System.out.println(linkedSet);
		System.out.println("Contain AquaMan "+linkedSet.contains("AquaMan"));
	}
}
