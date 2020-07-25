package com.example.javabasic.operator;

public class IncrementAndDecrementEx {
	public static void main(String[] args) {
	int i=0;
	int j=++i;
	System.out.println("j = "+j);
	j=i++;
	System.out.println("j = "+j);
	i=1;
	j=--i;
	System.out.println("j = "+j);
	j=i--;
	System.out.println("j = "+j);
	}
}