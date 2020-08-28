package com.example.javabasic.innerClass;

class OuterClass {
	private int x = 20;

	class InnerClass {
		void show() {
			System.out.println("Outer Class x = " + x);
		}
	}
	void display() {
		System.out.println("Inside Outer class method");
		InnerClass ic = new InnerClass();
		ic.show();
	}

	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
		obj.display();
		OuterClass.InnerClass in = obj.new InnerClass();
		in.show();
	}
}
