package com.example.javabasic.oopsconcept2;

public class Mobile {
	int ramSize = 4;

	class Bluetooth {
		boolean isBluetoothOn = false;

		void turnOn() {
			isBluetoothOn = true;
		}

		void turnOff() {
			isBluetoothOn = true;
		}

		String getStatus() {
			if (isBluetoothOn)
				return "on";
			return "off";
		}
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Mobile.Bluetooth bluetooth = mobile.new Bluetooth();
		System.out.println("Bluetooth Status " + bluetooth.getStatus());
		bluetooth.turnOn();
		System.out.println("Turning ON bluetooth");
		System.out.println("Bluetooth Status " + bluetooth.getStatus());
	}
}