package com.cocurrency;

public class CounterMain {

	public static void main(String[] args) {
		Counter count = new Counter();
		count.incrementI();
		count.incrementI();
		count.incrementI();
		System.out.println(count.getI());
	}
}
