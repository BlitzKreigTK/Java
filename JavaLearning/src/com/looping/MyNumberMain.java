package com.looping;

public class MyNumberMain {

	public static void main(String[] args) {
		MyNumber mynum = new MyNumber(6);
		boolean isPrime = mynum.isPrime();
		System.out.println("Is Prime --> " + isPrime);
		int sumUptoN = mynum.sumUptoNum();
		System.out.println("Sum up to N --> " + sumUptoN);
		int sumUpofDivisor = mynum.sumUpofDivisor();
		System.out.println("Sum of divisor --> " + sumUpofDivisor);
		mynum.printTriangle();
	}

}
