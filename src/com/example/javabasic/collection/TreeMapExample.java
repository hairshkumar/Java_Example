package com.example.javabasic.collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "SuperMan");
		map.put(2, "BatMan");
		map.put(4, "Flash");
		map.put(3, "AquaMan");
		display(map);
		System.out.println("Head Element: " + map.headMap(2));
		System.out.println("Tail Element: " + map.tailMap(2));
		System.out.println("SubMap: " + map.subMap(1, 3));
		map.remove(2);
		System.out.println("After Removing key 2");
		display(map);
	}

	static void display(Map<Integer, String> map) {
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
