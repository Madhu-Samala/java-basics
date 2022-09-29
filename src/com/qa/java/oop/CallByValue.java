package com.qa.java.oop;

public class CallByValue {

	static int sum(int no1, int no2) {
		no1 = 1000;
		no2 = 2000;
		System.out.println("no1 in sum :" + no1); //1000
		System.out.println("no2 is sum :" + no2); //2000
		return no1 + no2;
	}	
	
	
	
	public static void main(String[] args) {
		//call sum method
		int no1 = 100;
		int no2 = 200;
		
		int sum = sum(no1,no2);
		System.out.println(sum); //3000
		
		System.out.println("no1 in main:" + no1); //100
		System.out.println("no2 in main:" + no2); //200

	}

}
