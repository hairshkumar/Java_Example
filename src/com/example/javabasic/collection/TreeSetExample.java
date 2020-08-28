package com.example.javabasic.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		System.out.println("Adding 6");
		set.add(6);
		System.out.println(set);
		System.out.println("Reverse Set: " + set.descendingSet());
		System.out.println("Head Set: " + set.headSet(3, true));
		System.out.println("SubSet: " + set.subSet(1, false,3, true));
		System.out.println("TailSet: " + set.tailSet(3));
	}
}
