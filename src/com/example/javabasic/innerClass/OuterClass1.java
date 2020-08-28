package com.example.javabasic.innerClass;

public class OuterClass1 {

	void display() {
		int x = 2;
		class LocalClass {
			int y = 2;
			void show() {
				System.out.print("X =" + x);
				System.out.println("Y =" + y);
			}
		}
		LocalClass local = new LocalClass();
		local.show();
	}

	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		outer.display();
	}
}