package com.basic;

public class Calculator {

	public void perfOperation(int operation, int num1, int num2) {
		if (operation == 1) {
			System.out.println("Addition -- " + (num1 + num2));
		} else if (operation == 2) {
			System.out.println("Substraction -- " + (num1 - num2));
		} else if (operation == 3) {
			System.out.println("Multiplication -- " + (num1 * num2));
		} else if (operation == 4) {
			System.out.println("Substraction -- " + (num1 / num2));
		} else {
			System.out.println("Invalid operation");
		}
	}
}
