package com.example.javabasic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	static void display(Map<Integer, String> map) {
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "SuperMan");
		hashMap.put(2, "BatMan");
		hashMap.put(3, "AquaMan");
		display(hashMap);
		hashMap.putIfAbsent(4, "WonderWoman");
		System.out.println("After putIfAbsent");
		display(hashMap);
		hashMap.replace(1,"Flash");
		System.out.println("After Replacing Superman");
		display(hashMap);
		System.out.println("Contain key 1 "+hashMap.containsKey(1));
		System.out.println("Contain value BatMan "+hashMap.containsValue("BatMan"));
		hashMap.remove(1);
		System.out.println("Removing key 1");
		display(hashMap);
	}
}
