package com.exception;

import java.util.Scanner;

public class FinallyExceptionMain {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] num = { 1, 2, 23, 5, 6 };
			int number = num[1];
			System.out.println(number);
		} catch (Exception ex) {
			System.out.println("Catch Block");
			ex.printStackTrace();
		} finally {
			System.out.println("Before closing scanner");
			sc.close();
		}
	}

}
