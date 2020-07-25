package com.example.javabasic.oopsconcept;

class Car {
	private int speed = 60;

	public void moveforward() {
		System.out.println("Car moving at Speed"+speed);
	}
}

public class Audi extends Car {
	private int speed = 100;

	public void moveforward() {
		System.out.println("Audi moving at Speed"+speed);
	}

	public static void main(String[] args) {
		Car audiCar = new Audi();
		//call methods in Audi class
		audiCar.moveforward();
		Car car = new Car();
		//call methods in Car class
		car.moveforward();
	}
}