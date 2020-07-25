package com.example.javabasic.oopsconcept;

class Developer {
	String companyName = "XYZ tech";
	protected void ShowCommonInfo() {
		System.out.println("Company :" + companyName);
	}
}

class JavaDeveloper extends Developer {
	String lang = "Java";
	String tools = "eclipse";
	String role = "JavaDeveloper";
	public void showDetails() {
		ShowCommonInfo();
		System.out.println("Role :"+role);
		System.out.println("Program Lang:" + lang);
		System.out.println("IDE :" + tools);
	}
}

class WebDeveloper extends Developer {
	String lang = "HTML,css";
	String tools = "VScode";
	String role = "WebDeveloper";
	public void showDetails() {
		ShowCommonInfo();
		System.out.println("Role :"+role);
		System.out.println("Program Lang:" + lang);
		System.out.println("IDE :" + tools);
	}
}

public class HierarchicalEx  {
	public static void main(String[] args) {
		JavaDeveloper javaDeveloper=new JavaDeveloper();
		WebDeveloper webDeveloper=new WebDeveloper();
		javaDeveloper.showDetails();
		System.out.println();
		webDeveloper.showDetails();
	}
}