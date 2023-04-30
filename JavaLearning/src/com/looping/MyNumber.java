package com.looping;

public class MyNumber {

	private int num;

	public MyNumber(int num) {
		this.num = num;
	}

	public boolean isPrime() { // Number divisible by 1 and itself and negative numbers can't be prime
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoNum() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumUpofDivisor() { // for 6 it is divisible by 2 and 3 --> 2 + 3
		int sum = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printTriangle() {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
