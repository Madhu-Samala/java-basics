package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
//Creating objects for my Employee class
		int x;
		x = 50;

		Employee employee; // a reference variable
		employee = new Employee(111, "emp1", "development", 24234.234, (byte) 25, 'M'); // an employee object is created

		System.out.println("id: " + employee.id);
		System.out.println("name:" + employee.name);
		System.out.println("department:" + employee.department);
		System.out.println("gender:" + employee.gender);
		System.out.println("salary:" + employee.salary);
		System.out.println("age:" + employee.age);

		/*
		 * employee.id = 111; employee.name = "emp1"; employee.department =
		 * "development"; employee.gender = 'M'; employee.salary = 46564.45;
		 * employee.age = 25;
		 */

		/*
		 * System.out.println("id: "+ employee.id); System.out.println("name:"
		 * +employee.name); System.out.println("department:" +employee.department);
		 * System.out.println("gender:" + employee.gender); System.out.println("salary:"
		 * + employee.salary); System.out.println("age:" + employee.age);
		 */

		Employee employee2 = new Employee(222, "emp2", "QA", 456456.456, (byte) 30, 'F');
		/*
		 * employee2.id = 222; employee2.name = "emp2"; employee2.department = "QA";
		 * employee2.gender = 'F'; employee2.salary = 56564.45; employee2.age = 26;
		 */

		System.out.println("id: " + employee2.id);
		System.out.println("name:" + employee2.name);
		System.out.println("department:" + employee2.department);
		System.out.println("gender:" + employee2.gender);
		System.out.println("salary:" + employee2.salary);
		System.out.println("age:" + employee2.age);

		//Employee emp3 = new Employee();
	}

}
