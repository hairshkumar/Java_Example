package com.example.javabasic.DateAndTime;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is : " + calendar.getTime());
		calendar.add(Calendar.DATE, 15);
		System.out.println("Adding 15 Days : " + calendar.get(Calendar.DATE));
		calendar.add(Calendar.MONTH, 4);
		System.out.println("Adding 4 Months : " + calendar.get(Calendar.MONTH));
		calendar.add(Calendar.YEAR, 2);
		System.out.println("Adding 2 Years : " + calendar.get(Calendar.YEAR));
	}
}