package com.basic;

public class MultiplicationTable {

	void printTable() {
		printTable(1);
	}

	void printTable(int num) {
		printTable(num, 1, 10);
	}

	void printTable(int num, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i).println();
		}
	}
}
