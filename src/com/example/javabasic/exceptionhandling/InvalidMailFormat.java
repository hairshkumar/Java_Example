package com.example.javabasic.exceptionhandling;

public class InvalidMailFormat extends Exception {

	private String errorMsg;

	public InvalidMailFormat(String errorMsg) {
		super(errorMsg);
		this.errorMsg=errorMsg;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}	
}