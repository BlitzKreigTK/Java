package com.functionalProgramming;

import java.util.List;

public class FPNumberMain {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 6, 8, 6, 10);
		int sumOfList = normalMethod(list);
		System.out.println("Normal Method = " + sumOfList);
		int sumOfListEven = normalMethodSumEven(list);
		System.out.println("Normal Method Sum of even = " + sumOfListEven);
		int sumOfListFP = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		int sumOfListFPEven = methodWithFPSumEven(list);
		System.out.println("With Func Prog -> " + sumOfListFP);
		System.out.println("With Func Prog Sum of even -> " + sumOfListFPEven);
	}

	private static int normalMethod(List<Integer> list) {
		int sum = 0;
		for (Integer l : list) {
			sum += l;
		}
		return sum;
	}

	private static int normalMethodSumEven(List<Integer> list) {
		int sum = 0;
		for (Integer l : list) {
			if (l % 2 == 0) {
				sum += l;
			}
		}
		return sum;
	}

	private static int methodWithFPSumEven(List<Integer> list) {
		return list.stream().filter(element -> element % 2 == 0).reduce(0, (number1, number2) -> {
			System.out.println("Inside FP method of sum of even in a list num1, num2 -> " + number1 + ", " + number2);
			return number1 + number2;
		});
	}
}
