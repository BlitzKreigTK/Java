package com.collections;

import java.util.HashMap;

public class MapMain {
	public static void main(String[] args) {
		String str = "This has been great adventure. This has never happened before. Welcome Java";
		char[] chrs = str.toCharArray(); // String to char array
		HashMap<Character, Integer> occurrencesChar = new HashMap<>();
		for (char chr : chrs) { // For each char get occurrences, if occurrence is null put 1 else, integer + 1
			Integer integer = occurrencesChar.get(chr);
			if (integer == null) {
				occurrencesChar.put(chr, 1);
			} else {
				occurrencesChar.put(chr, 1 + integer);
			}
		}
		System.out.println("Occurrences of each char === " + occurrencesChar);

		String[] strings = str.split(" "); // String to string array separated by " "
		HashMap<String, Integer> occurrencesStr = new HashMap<>();
		for (String string : strings) {
			Integer integer = occurrencesStr.get(string);
			if (integer == null) {// For each String get occurrences,if occurrence is null put 1 else, integer + 1
				occurrencesStr.put(string, 1);
			} else {
				occurrencesStr.put(string, 1 + integer);
			}
		}
		System.out.println("Occurrences of each char === " + occurrencesStr);

	}
}
