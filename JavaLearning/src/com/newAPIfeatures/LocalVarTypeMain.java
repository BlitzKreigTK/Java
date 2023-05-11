package com.newAPIfeatures;

import java.util.List;

public class LocalVarTypeMain {

	public static void main(String[] args) {
		List<String> name1 = List.of("Tulsi", "Sachin");
		List<String> name2 = List.of("Raunit", "Jaiswal");
		// Without using var it becomes complex list string inside string
		List<List<String>> names = List.of(name1, name2);
		System.out.println("Without using var = " + names);
		// Using var keyword
		// var abc = null (Not allowed)
		var namesVar = List.of(name1, name2);
		System.out.println("With using var = " + namesVar);
		final var namesVar2 = List.of(name1, name2);
		System.out.println("Using var with Final = " + namesVar2);
		System.out.println("Functional programming without var");
		List.of("Tulsi", "Jaiswal").stream().filter(s -> s.length() > 5).forEach(System.out::println);
		System.out.println("Using var in functional programming");
		var exp = List.of("Tulsi", "Jaiswal").stream().filter(s -> s.length() > 5);
		exp.forEach(System.out::println);
		System.out.println("========Using var in loop========");
		for (var nameVarLoop : names)
			System.out.println(nameVarLoop);
	}

}
