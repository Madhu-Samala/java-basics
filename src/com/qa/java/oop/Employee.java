package com.qa.java.oop;

public class Employee {
	
	//State ( data )
	//instance variables
	int id;
	String name;
	String department;
	double salary;
	float incrementPercentage;
	byte age;
	char gender;
	//coding standards for static
	final static String COMPANY_NAME = "QA";
	final static double COMPANY_REVENUE = 34534543.34534;
	//Each employee object will have its own state
	
	//No-arg constructor
	/*
	 * Employee(){ System.out.println("Employee() constructor is called.."); id =
	 * 111; name = "emp1"; department = "development"; salary = 456456.45; age = 25;
	 * gender = 'M';
	 * 
	 * }
	 */
	//Arg constructor
	public Employee(int id, String name, String department, double salary, byte age, char gender,float incrementPercentage) {
		System.out.println("Employee(arg) constructor is called...");
		this.id = id; // this refers to the current instance (object)
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.incrementPercentage = incrementPercentage;
	}
	
	
	
	//method
	/*
	 * Display employee information
	 */
	//instance method
	void displayEmployeeInformation() {
		System.out.println("id: " + id);
		System.out.println("name:" + name);
		System.out.println("department:" + department);
		System.out.println("gender:" + gender);
		System.out.println("salary:" + salary);
		System.out.println("age:" + age);
	}
	
	/*
	 * Calculate Incremented Salary of an employee
	 */
	
	double incrementedSalary() {
		return ( salary * incrementPercentage / 100 );
	}
	
	/*
	 * Calculate the total salary after the increment
	 */
	
	double totalSalary() {
		return salary + incrementedSalary();
	}
	
	static void companyInformation() {
		System.out.println("Company Name : " + COMPANY_NAME);
		System.out.println("Company Revenue : " + COMPANY_REVENUE);
		
	}
	
	
	
	
	
	

}
