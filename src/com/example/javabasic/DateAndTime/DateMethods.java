package com.example.javabasic.DateAndTime;

import java.util.Date;  

public class DateMethods {

	public static void main(String[] args) {
	    Date today=new Date(2020,7,10);  
        Date tomorrow=new Date(2020,7,11);  
        boolean isAfter=today.after(tomorrow);
        boolean isBefore=today.before(tomorrow);
        int compare=today.compareTo(tomorrow);
        System.out.println("today is After tomorrow "+isAfter);
        System.out.println("today is Before tomorrow "+isBefore);
        System.out.println("comparing today and tomorrow "+compare);
	}
}
