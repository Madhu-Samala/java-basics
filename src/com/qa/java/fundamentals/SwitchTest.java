package com.qa.java.fundamentals;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1. Add Product");
		System.out.println("2. Get Product");
		System.out.println("3. Update Product");
		System.out.println("4. Delete Product");
		System.out.println("Enter your input :");
		int choice;
		choice = 1;

		switch (choice) {
		case 1:
			System.out.println("Adding product code");
			break;
		case 2:
			System.out.println("Get Product Details code");
			break;
		case 3:
			System.out.println("Update Product Details code");
			break;
		case 4:
			System.out.println("Delete Product Code");
			break;
		default:
			System.out.println("Invalid input. Try Again!!");
		}

	}

}
