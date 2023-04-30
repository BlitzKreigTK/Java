package com.looping;

import java.util.Scanner;

public class DoPrintCubeMain {

	public static void main(String[] args) {
		printCubes();
	}

	public static void printCubes() {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		do {
			if (num != -1) {
				System.out.println("Cube is --> " + (num * num * num));
			}
			System.out.print("Enter a number :");
			num = sc.nextInt();
		} while (num >= 0);
		System.out.println("Negative number entered exiting.");
		sc.close();
	}
}
