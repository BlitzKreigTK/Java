package com.newAPIfeatures;

public class SwitchExpressionMain {
	public static String finalDayOfWeek(int day) {
		String dayOfWeek = "";
		switch (day) {
		case 0:
			dayOfWeek = "Monday";
			break;
		case 1:
			dayOfWeek = "Tuesday";
			break;
		case 2:
			dayOfWeek = "Wednesday";
			break;
		case 3:
			dayOfWeek = "Thursday";
			break;
		case 4:
			dayOfWeek = "Friday";
			break;
		default:
			throw new IllegalArgumentException("Invalid week day -->" + day);
		}
		return dayOfWeek;
	}

	public static String finalDayOfWeekUsingSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Some other logic");
			yield "Monday";
		}
		case 1 -> "Tuesday";
		case 2 -> "Wednesday";
		case 3 -> "Thursday";
		case 4 -> "Friday";
		default -> throw new IllegalArgumentException("Invalid week day -->" + day);
		};
		return dayOfWeek;
	}

	public static void main(String[] args) {
		System.out.println("Using Switch Case" + finalDayOfWeek(4));
		System.out.println("Using Switch Expression" + finalDayOfWeekUsingSwitchExpression(4));
	}
}
