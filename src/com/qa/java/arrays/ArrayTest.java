package com.qa.java.arrays;

public class ArrayTest {

	public static void main(String[] args) {

		/*
		 * int id1, id2, id3; id1 = 111; id2 = 222; id3 = 333;
		 */
		// Array syntax
		// datatype[] reference
		int[] ids; // just only reference is created
		ids = new int[3]; // instantiation ( creation of object)
		// initializing the array elements
		ids[0] = 111;
		ids[1] = 222;
		ids[2] = 333;
		System.out.println(ids[2]);
		// Accessing array elements
		// manipulating array elements	
		

		for (int index = 0; index < ids.length; index++) {
			ids[index] = ids[index] + 10;
			System.out.println(ids[index]);
		}

		// enhanced for loop
		// for each element in array
		// Reading the elements
		for (int id : ids) {			
			System.out.println(id);
		}
		
		int[] nos = {10,20,30,40};
		System.out.println(nos[3]);
		
		
		
		for(int no : nos) {
			System.out.println(no);
		}
		char[] genders = {'M','F','F','M','F','M','F'};
		
		for(char gender : genders) {
			System.out.println(gender);
		}
		
		ArrayUtil arrayUtil = new ArrayUtil();
		int maleCount = arrayUtil.getMaleGenderCount(genders);
		System.out.println("Male count : " + maleCount);
		int femaleCount = arrayUtil.getFemaleGenderCount(genders);
		System.out.println("Female Count : " + femaleCount);
		

		
		
	}

}
