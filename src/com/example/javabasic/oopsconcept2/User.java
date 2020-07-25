package com.example.javabasic.oopsconcept2;

import java.util.Scanner;
import com.example.javabasic.oopsconcept2.*;
public class User {
	private UserDetails userDetails;
	
	public User() {
		userDetails=new UserDetails();
	}
	
	public void updateUser(String name,long phno)
	{
		userDetails.setUserName(name);
		userDetails.setMobileNo(phno);
		userDetails.showDetails();
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=scanner.next();
		System.out.println("Enter Mobile");
		long mobileno=scanner.nextLong();
		User user=new User();
		user.updateUser(name, mobileno);
		scanner.close();
	}
}