package com.looping;

public class PrintWhile {

	private int num;

	public PrintWhile(int num) {
		this.num = num;
	}

	public void printSquares() {
		int i = 1;
		while (i * i <= num) {
			System.out.println(i * i);
			i++;
		}
	}

	public void printCubes() {
		int i = 1;
		while (i * i * i <= num) {
			System.out.println(i * i * i);
			i++;
		}
	}

}
