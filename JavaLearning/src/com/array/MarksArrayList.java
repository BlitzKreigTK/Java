package com.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class MarksArrayList {
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;

	public MarksArrayList(String name, int... marks) {
		for (int mark : marks) {
			this.marks.add(mark);
		}
		this.name = name;
	}

	public int getNumberOfMarks() {
		int num = marks.size();
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
		return Collections.max(marks);
	}

	public int getMinimumOfMarks() {
		return Collections.min(marks);
	}

	public BigDecimal getAvgMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal num = new BigDecimal(getNumberOfMarks());
		BigDecimal avg = sum.divide(num, 3, RoundingMode.UP);
		return avg;
	}

	public ArrayList<Integer> addNewMarks(int newMarks) {
		marks.add(newMarks);
		return marks;
	}

	public ArrayList<Integer> removeOneMarks(int newMarks) {
		marks.remove((Integer) newMarks);
		return marks;
	}

	@Override
	public String toString() {
		return name + " --> " + marks;
	}
}
