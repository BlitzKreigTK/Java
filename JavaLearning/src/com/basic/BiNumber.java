package com.basic;

public class BiNumber {
	private int num1;
	private int num2;

	BiNumber(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	int add() {
		return this.num1 + this.num2;
	}

	int multiply() {
		return this.num1 * this.num2;
	}

	void double_num() {
		this.num1 *= 2;
		this.num2 *= 2;
		System.out.println("Doubling " + this.num1 + " " + this.num2);
	}
}
