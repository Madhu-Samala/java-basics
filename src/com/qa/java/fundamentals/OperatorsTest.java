package com.qa.java.fundamentals;

public class OperatorsTest {

	public static void main(String[] args) {

		//Assignment Operator
		// = is used to assign values
		
		byte age;
		age = 20;
		short salary;
		salary = 30000;
		
		/*
		 * Logical Operators
		 * && AND
		 * || OR
		 * ^ XOR
		 */
		
		// (exp1) && (exp2) && (exp3)
		//Rule
		//If any of the expression is false, then the entire resultant is false
		/*
		 *  T T -> T
		 *  T F -> F
		 *  F T -> F
		 *  F F -> F
		 */
		
		salary = 30435;
		age = 25;

		System.out.println((salary > 50000) && (age < 30));
		
		// (exp1) || (exp2) || (exp3)
				//Rule
				//If any of the expression is true, then the entire resultant is true
				/*
				 *  T T -> T
				 *  T F -> T
				 *  F T -> T
				 *  F F -> F
				 */
		salary = 30435;
		age = 25;
		System.out.println((salary < 50000) || (age > 30));
		
		// (exp1) ^ (exp2) ^ (exp3)
		//Rule
		//If both the expressions are evaluated to the same result, then the resultant is false
		/*
		 *  T T -> F
		 *  T F -> T
		 *  F T -> T
		 *  F F -> F
		 */
	}

}
