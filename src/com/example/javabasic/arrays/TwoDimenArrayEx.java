package com.example.javabasic.arrays;

public class TwoDimenArrayEx {

	public static void main(String[] args) {
		int number[][]=new int[][] {{1,2},{1,2}};
		//Initialization of array
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				number[i][j]=i+j;
			}
		}
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+" ");
			}
			//to print in next line
			System.out.println();
		}
	}
}