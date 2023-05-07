package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	public static void main(String[] args) {
		List<Character> set = List.of('A', 'X', 'Z', 'D', 'C');
		Set<Character> hashset = new HashSet<>(set);
		Set<Character> treeset = new TreeSet<>(set);
		Set<Character> linkset = new LinkedHashSet<>(set);
		System.out.println("Hashset ====");
		System.out.print(hashset + "");
		System.out.println("\nTreeset ====");
		System.out.print(treeset + "");
		System.out.println("\nTreeset ====");
		System.out.print(linkset + "");
	}
}
