package com.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class ChallengesFPMain {

	public static void main(String[] args) {
		List<String> str = List.of("Apple", "Ant", "Bat");
		List<Integer> num = List.of(5, 34, 7, 2, 99, 1);

		System.out.println("Print squares of first 10 numbers");
		IntStream.range(0, 10).map(e -> e * e).forEach(e -> System.out.println(e));

		System.out.println("Print each of the string to LowerCase");
		str.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		System.out.println("Print each string length");
		str.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

		System.out.println("Print max of a List integer");
		int max = num.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(max);
	}
}