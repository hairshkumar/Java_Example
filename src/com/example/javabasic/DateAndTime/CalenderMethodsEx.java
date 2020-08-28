package com.example.javabasic.DateAndTime;

import java.util.Calendar;

public class CalenderMethodsEx {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Today is : "+calendar.getTime());
		int maxDaysInWeek = calendar.getMaximum(Calendar.DAY_OF_WEEK);
		int maxWeeksInYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		int maxWeeksInMonth = calendar.getMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("Days in Week Maximum "+ maxDaysInWeek);
		System.out.println("Week in Year Maximum "+maxWeeksInYear);
		System.out.println("Week in Month Maximum "+maxWeeksInMonth);
	}
}
