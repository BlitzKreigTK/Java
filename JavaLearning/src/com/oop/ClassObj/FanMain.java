package com.oop.ClassObj;

public class FanMain {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacture-1", 1.31, "White");
		fan.switchOn();
		// fan.switchOff();
		fan.setSpeed();
		System.out.println(fan.toString());
	}
}
