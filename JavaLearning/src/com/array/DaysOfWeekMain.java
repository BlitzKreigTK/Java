package com.array;

public class DaysOfWeekMain {

	public static void main(String[] args) {
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		DaysOfWeek dow = new DaysOfWeek(days);
		System.out.println("Day with most characters --> " + dow.daysWithMaxChar());
		dow.printDaysBack();
	}
}
