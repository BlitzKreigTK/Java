package com.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceMain {
	public static void printLength(Integer num) {
		System.out.println(num);
	}

	public static boolean findEven(Integer num) {
		return num % 2 == 0;
	}

	// Storing functions into a variable using FP
	Predicate<? extends Integer> predicateEven = n -> n % 2 == 0;

	// Returning a value from a function using FP
	public static Predicate<? extends Integer> predicateOdd() {
		return num -> num % 2 == 1;
	}

	public static void main(String[] args) {
		System.out.println("Normal Reference");
		List.of("Elephant", "Tiger", "Lion").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
		System.out.println(List.of(23, 24, 56, 12, 11).stream().filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));

		System.out.println("Method Reference");
		// Method reference makes code for readable ClassName::MethodName
		List.of("Elephant", "Tiger", "Lion").stream().map(String::length).forEach(System.out::println);
		System.out.println("Method Reference with static method");
		List.of("Elephant", "Tiger", "Lion").stream().map(String::length).forEach(MethodReferenceMain::printLength);
		System.out.println(List.of(23, 24, 56, 12, 11).stream().filter(MethodReferenceMain::findEven)
				.max(Integer::compare).orElse(0));
	}

}
