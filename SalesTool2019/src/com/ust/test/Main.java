package com.ust.test;

public class Main {
	public static void main(String[] args) {
		SalesData objSalesData=new SalesData();
		System.out.println("WELCOME");
		displayGreeting();
		objSalesData.display();
		
	}
	private static void displayGreeting() {
		System.out.println("HELLO");
	}

}
