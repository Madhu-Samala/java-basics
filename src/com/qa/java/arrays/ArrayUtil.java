package com.qa.java.arrays;

public class ArrayUtil {
	/*
	 * Method to calculate the male gender count
	 */
	int getMaleGenderCount(char[] genders) {
		int count = 0;
		for (char gender : genders) {
			if (gender == 'M')
				count++;
		}

		return count;

	}

	int getFemaleGenderCount(char[] genders) {
		int count = 0;
		for (char gender : genders) {
			if (gender == 'F')
				count++;
		}

		return count;
	}
	
	
	
	//How many employees are above the age of 25 and Male
	/* int employeeAgeAndGender(Employee[] emps, int age, char gender)
	 * 
	 */
	int employeeAgeAndGender(Employee[] emps, int age, char gender) {
		int count = 0;
		for(Employee emp : emps) {
			if(emp.age >= age && emp.gender == gender)
				count++;
		}
		return count;
	}
}
