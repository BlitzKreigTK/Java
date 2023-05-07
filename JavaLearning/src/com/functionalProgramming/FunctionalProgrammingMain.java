package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingMain {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Mango", "Pear", "Banana", "Guava");
		normalMethod(list);
		System.out.println();
		methodWithFuncProg(list);
		System.out.println();
		normalMethodFilterString(list);
		System.out.println();
		methodWithFilterStringFuncProg(list);
	}

	public static void normalMethod(List<String> list) {
		for (String l : list) {
			System.out.print(l + " ");
		}
	}

	public static void normalMethodFilterString(List<String> list) {
		for (String l : list) {
			if (l.endsWith("a"))
				System.out.print(l + " ");
		}
	}

	public static void methodWithFuncProg(List<String> list) {
		list.stream().forEach(element -> System.out.print(element + " "));
	}

	public static void methodWithFilterStringFuncProg(List<String> list) {
		list.stream().filter(element -> element.endsWith("a")).forEach(element -> System.out.print(element + " "));
	}
}
