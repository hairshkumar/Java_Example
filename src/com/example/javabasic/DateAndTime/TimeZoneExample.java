package com.example.javabasic.DateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone timeZone = calendar.getTimeZone();
		System.out.println("Default TimeZone "+timeZone.getDisplayName());
		timeZone=TimeZone.getTimeZone("Europe/Copenhagen");
		calendar.setTimeZone(timeZone);
		System.out.println("Adding new TimeZone "+timeZone.getDisplayName());
	}
}
