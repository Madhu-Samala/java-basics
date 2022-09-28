package com.qa.java.fundamentals;

public class NestedForTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if(i ==1 || j == 3) break;
				System.out.println(i + " " + j);
			}
		}
	}

}
