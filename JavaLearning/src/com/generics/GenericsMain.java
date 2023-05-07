package com.generics;

public class GenericsMain {

	public static void main(String[] args) {
		GenericList<String> list1 = new GenericList<>();
		list1.addEle("Element 1");
		list1.addEle("Element 2");
		list1.removeEle("Element 2");
		String value = list1.get(0);
		System.out.println(list1);
		System.out.println(value);

		GenericList<Integer> list2 = new GenericList<>();
		list2.addEle(Integer.valueOf(10));
		list2.addEle(Integer.valueOf(20));
		list2.removeEle(Integer.valueOf(20));
		Integer value2 = list2.get(0);
		System.out.println(list2);
		System.out.println(value2);
	}

}
