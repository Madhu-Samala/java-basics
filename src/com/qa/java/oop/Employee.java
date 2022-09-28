package com.qa.java.oop;

public class Employee {
	
	//State ( data )
	int id;
	String name;
	String department;
	double salary;
	byte age;
	char gender;
	//Each employee object will have its own state
	
	//No-arg constructor
	/*
	 * Employee(){ System.out.println("Employee() constructor is called.."); id =
	 * 111; name = "emp1"; department = "development"; salary = 456456.45; age = 25;
	 * gender = 'M';
	 * 
	 * }
	 */
	public Employee(int id, String name, String department, double salary, byte age, char gender) {
		System.out.println("Employee(arg) constructor is called...");
		this.id = id; // this refers to the current instance (object)
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}
	
	//Arg constructor
	

}
