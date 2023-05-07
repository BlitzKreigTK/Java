package com.javaTips;

import java.util.Arrays;

enum Season {
	WINTER(4), SPRING(3), SUMMER(1), RAIN(5);

	private int value;

	public int getValue() {
		return value;
	}

	private Season(int value) {
		this.value = value;
	}
}

public class EnumMain {
	public static void main(String[] args) {
		Season s0 = Season.RAIN;
		System.out.println("Get value of an element in Enum == " + s0);
		// Get value of specific element
		Season s1 = Season.valueOf("SUMMER");
		System.out.println("Get value of an element in Enum using valueOf() == " + s1);
		// Get position of specific element
		System.out.println("Position of SUMMER in Enum == " + s1.ordinal());
		System.out.println("Assigned value of SUMMER in Enum == " + s1.getValue());
		// Get all values in an Enumeration
		System.out.println("Reading each values in Enum == " + Arrays.toString(Season.values()));
	}
}
