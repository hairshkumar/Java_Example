package com.example.javabasic.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println(set);
		System.out.println("Adding Duplicate Three");
		set.add("Three");
		System.out.println(set);
		System.out.println("Removing Two");
		set.remove("Two");
		System.out.println(set);
		System.out.println("Set Contain One "+set.contains("One"));
		System.out.println("Removing All");
		set.clear();
		System.out.println(set);
	}
}
