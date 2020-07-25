package com.example.javabasic.oopsconcept;

class modifier {

	//default modifier as no modifier is declared
	String name = "Jack";

	private void changeName(String newName) {
		name = newName;
	}

	public void showName() {
		System.out.println("name = " + name);
	}

	protected void addName(String lastname) {
		name=name.concat(lastname);
	}
}

public class AccessModifierEx {
	public static void main(String[] args) {
		modifier example = new modifier();
		example.showName();
		//Below line give error
		//as its private method
		//example.changeName("Sparrow");
		example.addName("Sparrow");
		System.out.println("name ="+example.name);
	}
}