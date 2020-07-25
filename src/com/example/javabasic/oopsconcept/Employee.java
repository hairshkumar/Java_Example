package com.example.javabasic.oopsconcept;

public class Employee {

	private String name;
	private int age;
	private Address address;

	public Employee(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void employeeInfo() {
		System.out.println("Name :" + name);
		System.out.println("age :" + age);
		System.out.println("Address :" + address.streetName);
		System.out.println("pincode :" + address.pincode);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Kumar", 25, new Address("Dev Street", 404));
		employee.employeeInfo();
	}
}

class Address {
	String streetName;
	int pincode;

	public Address(String streetName, int pincode) {
		this.streetName = streetName;
		this.pincode = pincode;
	}
}