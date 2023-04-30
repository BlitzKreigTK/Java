package com.basic;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("First number -- " + num1);
		System.out.println("Enter num2 ");
		int num2 = sc.nextInt();
		System.out.println("Second number -- " + num2);
		System.out.println("Choose operations: 1 - ADD, 2 - SUB, 3 - MUL, 4 - DIV");
		int operation = sc.nextInt();
		cal.perfOperation(operation, num1, num2);
		sc.close();
	}
}
