package com.javaTips;

class Test {
	public static final int sec_in_a_min = 60;
}

public class PublicStaticFinalMain {
	public static final int sec_in_min = 60;
	public static final int min_in_hour = 60;
	public static final int hour_in_day = 60;
	public static final int sec_in_day = sec_in_min * min_in_hour * hour_in_day;

	public static void main(String[] args) {
		System.out.println("Integer min/max value: " + Integer.MIN_VALUE + "/" + Integer.MAX_VALUE);
		System.out.println("Seconds in a day: " + sec_in_day);
		System.out.println("Seconds in a min: " + Test.sec_in_a_min);
	}
}
