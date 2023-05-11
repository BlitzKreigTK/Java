package com.newAPIfeatures;

import java.util.ArrayList;
import java.util.List;

public class CopyOfAPIMain {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Tulsi");
		names.add("Satya");
		names.add("Sachin");
		// Sending the immutable list which cannot be modified by other methods
		List<String> copyOfNames = List.copyOf(names);
		// Sending the list which can be modified by other methods
		// doNotChange(names);
		doNotChange(copyOfNames);
		System.out.println(names);
	}

	private static void doNotChange(List<String> names) {
		names.add("Should not have changed"); // Some method modifies list unknowingly
	}
}
