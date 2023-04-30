package com.basic;

public class IfElseConditional {

	public static void main(String[] args) {
		condition4();
	}

	static int i = 10;

	public static void condition1() { // if true execute if statement, otherwise else
		if (i == 10) {
			System.out.println("Equal to 10");
		} else {
			System.out.println("Not equal to 10");
		}
	}

	public static void condition2() { // in this case only 1 statement is executed, otherwise else
		if (i != 10)
			System.out.println("Not equal to 10");
		System.out.println("Equal to 10");
	}

	public static void condition3() { // nested if-else will execute only 1 true statement, if 1 statement is true it
										// won't go in
		// other condition to check, otherwise else
		if (i == 10) {
			System.out.println("Equal to 10");
		} else if (i > 0) {
			System.out.println("Greater than 0");
		} else {
			System.out.println("Not equal to 10");
		}
	}

	public static void condition4() { // If has if inside then if1 true then it will go to if2 otherwise else
		if (i != 10)
			System.out.println("Not equal to 10");
		if (i > 0)
			System.out.println("Greater than 0");
		System.out.println("Equal to 10");
	}
}
