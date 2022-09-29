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

}
