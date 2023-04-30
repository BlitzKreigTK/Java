package com.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Marks {
	private int[] marks;

	public Marks(String name, int... marks) {
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		int num = marks.length;
		return num;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumOfMarks() {
		int max = 0;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimumOfMarks() {
		int min = 0;
		for (int i = 0; i < marks.length - 1; i++) {
			if (marks[i] < marks[i + 1]) {
				min = marks[i];
			}
		}
		return min;
	}

	public BigDecimal getAvgMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal num = new BigDecimal(getNumberOfMarks());
		BigDecimal avg = sum.divide(num, 3, RoundingMode.UP);
		return avg;
	}

	public int[] addNewMarks(int newMarks) {
		int[] temp = new int[marks.length + 1];
		for (int i = 0; i < marks.length; i++) {
			temp[i] = marks[i];
		}
		temp[marks.length] = newMarks;
		return temp;
	}

	public int[] removeOneMarks() {
		int[] temp = new int[marks.length - 1];
		for (int i = 0; i < marks.length - 1; i++) {
			temp[i] = marks[i];
		}
		return temp;
	}
}
