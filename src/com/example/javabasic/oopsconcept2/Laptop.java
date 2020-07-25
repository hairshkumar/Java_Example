package com.example.javabasic.oopsconcept2;

public class Laptop {

	static boolean showVirtualkey = false;

	static class Keyboard {
		char keyA = 'a';
		char keyB = 'b';
		boolean isCapsLockUp = false;
		char onKeyUp(char key) {
			if (isCapsLockUp)
				return Character.toUpperCase(key);
			return keyA;
		}
		void showVirtual() {
			if (showVirtualkey)
				System.out.println("Showing Virtual keys");
		}
	}

	public static void main(String[] args) {
		System.out.println("Pressing Key a");
		Laptop.Keyboard keyboard = new Laptop.Keyboard();
		System.out.println(keyboard.onKeyUp(keyboard.keyA));
		System.out.println("Turning CapsLock On");
		System.out.println("Pressing Key a");
		keyboard.isCapsLockUp = true;
		System.out.println(keyboard.onKeyUp(keyboard.keyA));
		keyboard.showVirtual();
	}
}