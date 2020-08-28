package com.example.javabasic.innerClass;

public class OuterClass2 {

	void show() {
		System.out.println("Inside show of Outer");
	}
	
	public static void main(String[] args) {
		//Anonymous class
		OuterClass2 class2=new OuterClass2() {
			@Override
			void show() {
			System.out.println("Inside show of Anonymous");
			}
		};
		class2.show();
	}
}
