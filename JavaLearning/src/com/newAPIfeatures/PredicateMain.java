package com.newAPIfeatures;

import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
	public static boolean evenNum(Integer num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 11, 56, 89);
		Predicate<Integer> evenPred = num -> num % 2 == 0;
		System.out.println("==Print even numbers using predicate===");
		numbers.stream().filter(evenPred).forEach(System.out::println);
		System.out.println("==Print odd numbers using predicate.negate==");
		numbers.stream().filter(evenPred.negate()).forEach(System.out::println);
		System.out.println("==Print even numbers using method==");
		numbers.stream().filter(PredicateMain::evenNum).forEach(System.out::println);
		System.out.println("==Print odd numbers using Predicate.not==");
		numbers.stream().filter(Predicate.not(PredicateMain::evenNum)).forEach(System.out::println);
	}
}
