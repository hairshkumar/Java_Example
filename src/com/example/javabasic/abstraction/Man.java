package com.example.javabasic.abstraction;

abstract class human{
	public abstract void work();
	public abstract void love();
}

public class Man extends human {

	@Override
	public void work() {
		System.out.println("Man Work for his family");
	}
	@Override
	public void love() {	
		System.out.println("Man loves his family");
	}
	public static void main(String[] args) {
		Man man=new Man();
		man.work();
		man.love();
	}
}