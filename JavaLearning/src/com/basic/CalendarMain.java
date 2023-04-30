package com.basic;

public class CalendarMain {

	public static void main(String[] args) {
		System.out.println(isDayofWeek(1));
		System.out.println(isWeekday(1));
	}

	public static String isDayofWeek(int i) { // if case has return then we don't need to define break statement
		switch (i) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return "Invalid Day";
	}

	public static String isWeekday(int i) { // Fall through case in which flow goes till break or return is executed
		switch (i) {
		case 0:
		case 6:
			return "Yes";
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return "No";
		}
		return "Invalid Day";
	}

}
