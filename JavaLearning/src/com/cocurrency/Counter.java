package com.cocurrency;

public class Counter {
	private int i;

	public int getI() {
		return i;
	}

	synchronized void incrementI() {
		i++;
	}
}
