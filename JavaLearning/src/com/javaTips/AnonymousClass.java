package com.javaTips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass {
	public static void main(String[] args) {
		// List.of() --> Immutable
		// List<String> list = new ArrayList<>(List.of()) --> Mutable
		List<String> list = new ArrayList<>(List.of("Ant", "Cat", "Ball", "Elephant"));
		// Sorting on String length
		Comparator<String> lengthStr = new Comparator<>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		};
		// Sorting based on String length we use comparator
		Collections.sort(list, lengthStr);
		System.out.println(list + " == Sorting based on String length");
		// Sorting based upon character occurrence
		Collections.sort(list);
		System.out.println(list + " == Sorting based upon character occurrence");
	}
}
