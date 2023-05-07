package com.exception;

import java.util.Scanner;

public class ExceptionWithResourceMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] num = { 1, 2, 23, 5, 6 };
			int number = num[1];
			System.out.println(number);
		}
	}

}
