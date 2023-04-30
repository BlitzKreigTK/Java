package com.basic;

public class BiNumberMain {
	public static void main(String[] args) {
		BiNumber bn = new BiNumber(5, 10);
		System.out.println("Adding " + bn.add());
		System.out.println("Multiplying " + bn.multiply());
		bn.double_num();
		System.out.println("First Number " + bn.getNum1());
		System.out.println("Second Number " + bn.getNum2());
	}
}
