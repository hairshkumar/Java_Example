package com.example.javabasic.oopsconcept;

class Samsung {
	String company="Samsung";
}
class SamsungMSeries extends Samsung{
	String type ="TouchScreen";
	boolean GPS=true;
	String charger="Type-c";
	public void showMSeriesinfo() {
		System.out.println("Company : "+super.company);
		System.out.println("Type : "+type);
		System.out.println("GPS : "+GPS);
		System.out.println("Charger : "+charger);
	}
}
public class SamsungM30s extends SamsungMSeries{
	
	double size=6.40;
	int batteryCapacity=6000;
	public void showMobileDetails() {
		showMSeriesinfo();
		System.out.println("Size : "+size);
		System.out.println("Battery : "+batteryCapacity);
	}	
	public static void main(String[] args) {
		SamsungM30s m30s=new SamsungM30s();
		m30s.showMobileDetails();
	}
}