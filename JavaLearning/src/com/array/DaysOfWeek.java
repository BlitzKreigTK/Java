package com.array;

public class DaysOfWeek {
	private String[] days;

	public DaysOfWeek(String[] days) {
		this.days = days;
	}

	public String daysWithMaxChar() {
		int max = 0;
		String maxDay = "";
		for (String day : days) {
			if (day.length() > max) {
				max = day.length();
				maxDay = day;
			}
		}
		return maxDay;
	}

	public void printDaysBack() {
		System.out.print("\n");
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.print(days[i] + " ");
		}
	}
}
