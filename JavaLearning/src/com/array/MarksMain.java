package com.array;

import java.math.BigDecimal;
import java.util.Arrays;

public class MarksMain {
	public static void main(String[] args) {
		int[] marks = { 70, 100, 90, 80, 50, 75, 63 };
		// Marks student = new Marks("Tulsi Kant", 70, 100, 90, 80, 50, 75, 63);
		Marks student = new Marks("Tulsi Kant", marks);
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int max = student.getMaximumOfMarks();
		int min = student.getMinimumOfMarks();
		BigDecimal avg = student.getAvgMarks();
		System.out.println("Number --> " + number);
		System.out.println("Sum --> " + sum);
		System.out.println("Max --> " + max);
		System.out.println("Min --> " + min);
		System.out.println("Average --> " + avg);
		int[] tempadd = student.addNewMarks(70);
		System.out.println("Last added --> " + (number + 1) + " --> " + Arrays.toString(tempadd));
		int[] tempremove = student.removeOneMarks();
		System.out.println("Last removed --> " + (number - 1) + " --> " + Arrays.toString(tempremove));
	}
}
