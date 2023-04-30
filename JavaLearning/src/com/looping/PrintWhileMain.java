package com.looping;

public class PrintWhileMain {

	public static void main(String[] args) {
		PrintWhile printWhile = new PrintWhile(20);
		System.out.println("Square --> ");
		printWhile.printSquares();
		System.out.println("Cubes --> ");
		printWhile.printCubes();
	}

}
