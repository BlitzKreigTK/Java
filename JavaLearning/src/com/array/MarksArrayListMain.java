package com.array;

import java.math.BigDecimal;

public class MarksArrayListMain {

	public static void main(String[] args) {
		int[] marks = { 70, 100, 90, 80, 50, 75, 63 };
		MarksArrayList student2 = new MarksArrayList("Tulsi Kant", marks);
		int number = student2.getNumberOfMarks();
		int sum = student2.getTotalSumOfMarks();
		int max = student2.getMaximumOfMarks();
		int min = student2.getMinimumOfMarks();
		BigDecimal avg = student2.getAvgMarks();
		System.out.println("Number --> " + number);
		System.out.println("Sum --> " + sum);
		System.out.println("Max --> " + max);
		System.out.println("Min --> " + min);
		System.out.println("Average --> " + avg);
		student2.addNewMarks(70);
		System.out.println("Last added --> " + student2.toString());
		student2.removeOneMarks(63);
		System.out.println("Last removed --> " + student2.toString());
	}
}
