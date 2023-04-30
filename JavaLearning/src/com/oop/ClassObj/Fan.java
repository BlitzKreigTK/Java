package com.oop.ClassObj;

public class Fan {
	// State
	private String manufacturer;
	private double radius;
	private String color;

	// Secondary required features of fan once created
	private boolean isOn;
	private byte speed;

	// Mandatory values while creating a fan will go in constructor
	public Fan(String manufacture, double radius, String color) {
		this.manufacturer = manufacture;
		this.radius = radius;
		this.color = color;
	}

	// Behaviour of a fan

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
	}

	public void setSpeed() {
		this.speed = 5;
	}

	@Override
	public String toString() {
		return String.format("Maker = %s, Radius = %f, Color = %s, Is On = %b, Speed = %d", manufacturer, radius, color,
				isOn, speed);
	}

}
