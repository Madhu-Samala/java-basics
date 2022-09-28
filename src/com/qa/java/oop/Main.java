package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
//Creating objects for my Employee class
		int x;
		x = 50;

		Employee emp1; // a reference variable
		emp1 = new Employee(111, "emp1", "development", 24234.234, (byte) 25, 'M', 11.3f); // an employee object is created

		/*
		 * System.out.println("id: " + emp1.id); System.out.println("name:" +
		 * emp1.name); System.out.println("department:" + emp1.department);
		 * System.out.println("gender:" + emp1.gender); System.out.println("salary:" +
		 * emp1.salary); System.out.println("age:" + emp1.age);
		 */
		
		emp1.displayEmployeeInformation();
		double incrementedSalary = emp1.incrementedSalary();
		System.out.println(incrementedSalary);
		
		System.out.println(emp1.name + "'s total Salary is : " + emp1.totalSalary());

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

		Employee emp2 = new Employee(222, "emp2", "QA", 456456.456, (byte) 30, 'F',22.3f);
		/*
		 * employee2.id = 222; employee2.name = "emp2"; employee2.department = "QA";
		 * employee2.gender = 'F'; employee2.salary = 56564.45; employee2.age = 26;
		 */

		/*
		 * System.out.println("id: " + emp2.id); System.out.println("name:" +
		 * emp2.name); System.out.println("department:" + emp2.department);
		 * System.out.println("gender:" + emp2.gender); System.out.println("salary:" +
		 * emp2.salary); System.out.println("age:" + emp2.age);
		 */
		emp2.displayEmployeeInformation();
		System.out.println(emp2.name +"'s incremented Salary : " + emp2.incrementedSalary());
		System.out.println(emp2.name + "'s total Salary is : " + emp2.totalSalary());
		//Employee emp3 = new Employee();
	}

}
