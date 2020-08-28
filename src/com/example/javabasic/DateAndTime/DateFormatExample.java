package com.example.javabasic.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("dd/mm/yyyy : "+formatter.format(date));
		formatter.applyPattern("hh:mm:ss a");
		System.out.println("hh:mm:ss : "+formatter.format(date));
		formatter.applyPattern("yyyy-MM-dd HH:mm:ss:sssz");
		System.out.println("yyyy-MM-ddTHH:mm:ss:sssZ : "+formatter.format(date));
	}
}
