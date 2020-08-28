package com.example.javabasic.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		System.out.println(list);
		System.out.println("Adding 4");
		list.add(4);
		System.out.println(list);
		System.out.println("Removing Element at index 0");
		list.remove(0);
		System.out.println(list);
		System.out.println("List contain 2 "+list.contains(2));
		System.out.println("Element At index 2 ="+list.get(2));
		System.out.println("List Size "+list.size());
	}
}
