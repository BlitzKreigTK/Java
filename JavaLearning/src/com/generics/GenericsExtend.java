package com.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsExtend {

	public static void main(String[] args) {
		System.out.println("=========================Generic Class Restricted method=========================");
		GenericsListExtends<Long> list1 = new GenericsListExtends<>();
		list1.addEle(5l);
		list1.addEle(6l);
		list1.removeEle(6l);
		Long value = list1.get(0);
		System.out.println(list1);
		System.out.println(value);
		System.out.println("=========================Generic Class Restricted method=========================");
		GenericsListExtends<Integer> list2 = new GenericsListExtends<>();
		list2.addEle(Integer.valueOf(10));
		list2.addEle(Integer.valueOf(20));
		list2.removeEle(Integer.valueOf(20));
		Integer value2 = list2.get(0);
		System.out.println(list2);
		System.out.println(value2);

		System.out.println(doubleValue(Integer.valueOf(10)));
		System.out.println(doubleValue("String added"));
		System.out.println(doubleValue(new ArrayList<Integer>(List.of(10, 20, 30))));

		LinkedList<Integer> arr = new LinkedList<>(List.of(10, 20, 30));
		System.out.println("=================================Generic method==================================");
		duplicateList(arr);
		System.out.println(arr);
		System.out.println("===========================Upper bound Generics method===========================");
		System.out.println(SumofNumbersList(List.of(1, 2, 3, 4)));
		System.out.println(SumofNumbersList(List.of(1.0, 2.0, 3.0, 4.0)));
		System.out.println(SumofNumbersList(List.of(1.1f, 2.2f, 3.3f, 4.4f)));
		System.out.println(SumofNumbersList(List.of(1l, 2l, 3l, 4l)));
		System.out.println("===========================Lower bound Generics method===========================");
		List<Number> emptyList = new ArrayList<>();
		addNumbers(emptyList);
		System.out.println(emptyList);
	}

	public static double SumofNumbersList(List<? extends Number> number) {
		double sum = 0.0;
		for (Number num : number) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void addNumbers(List<? super Number> number) {
		number.add(1);
		number.add(1.0);
		number.add(1.0f);
		number.add(1l);
	}

	public static <Type> /* Type */ Type /* Return Type */ doubleValue(Type val /* Value as param */) {
		return val;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" }) /* Ignore this added to suppress warning */
	public static <Type extends List> /* Type */ void /* Return Type */ duplicateList(Type list) {
		list.addAll(list);
	}

}
