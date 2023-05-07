package com.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class findEvenNum implements Predicate<Integer> {
	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}
}

class printNum implements Consumer<Integer> {
	@Override
	public void accept(Integer num) {
		System.out.println(num);

	}
}

class mapNum implements Function<Integer, Integer> {/* Input, Output */
	@Override
	public Integer apply(Integer num) {
		return num * num;
	}
}

public class BehindTheScenesMain {
	public static void main(String[] args) {
		List.of(34, 23, 56, 12, 90).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));
		List.of(34, 23, 56, 12, 90).stream().map(e -> e * e).forEach(e -> System.out.println(e));
		// For example .filter uses a interface Predicate which has an unimplemented
		// method "boolean test(T t);" so when we pass some action in
		// ".filter(n -> n % 2 == 0)" basically we're implementing the body of
		// "boolean test(T t);" which returns result as true or false or we're doing
		// method overriding.
		System.out.println("Overriding predicate class method");
		List.of(34, 23, 56, 12, 90).stream().filter(new findEvenNum()).forEach(e -> System.out.println(e));
		// For example .forEach uses a interface Consumer which has an unimplemented
		// method "void accept(T t);" so when we pass some action in
		// ".forEach(e -> System.out.println(e))" basically we're implementing the body
		// of "void accept(T t);" which accept result or we're doing method overriding.
		System.out.println("Overriding consumer class method");
		List.of(34, 23, 56, 12, 90).stream().filter(n -> n % 2 == 0).forEach(new printNum());
		// For example .map uses a interface Function which has an unimplemented
		// method "R apply(T t);" so when we pass some action in
		// "..map(e -> e * e)" basically we're implementing the body
		// of ".map(e -> e * e)" which accept result and returns result in another
		// object form or we're doing method overriding.
		System.out.println("Overriding Function<Map> class method");
		List.of(34, 23, 56, 12, 90).stream().map(new mapNum()).forEach(e -> System.out.println(e));
	}
}
