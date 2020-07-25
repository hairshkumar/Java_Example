package com.example.javabasic.oopsconcept2;

public class UserDetails {
	//read and write access
	private String userName;
	//read only
	private String userMail="xyz@gmail.com";
	//read and write access
	private long mobileNo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void showDetails() {
		System.out.println("Name : "+getUserName());
		System.out.println("Mobile : "+getMobileNo());
		System.out.println("Mailid : "+getUserMail());
	}
	
	public static void main(String[] args) {
		UserDetails details=new UserDetails();
		details.setUserName("Bharathkumar");
		details.setMobileNo(9840356029L);
		details.showDetails();
	}
}