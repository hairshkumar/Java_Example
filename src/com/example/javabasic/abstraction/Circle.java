package com.example.javabasic.abstraction;

interface Drawable {
	public void draw();
	public double getArea();
}

public class Circle implements Drawable {
	int radius = 5;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double getArea() {
		return (3.14 * radius * radius);
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		System.out.println("Area of Circle "+circle.getArea());
	}
}  