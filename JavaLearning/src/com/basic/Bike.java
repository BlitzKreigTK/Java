package com.basic;

public class Bike {
	private String name;
	private int speed; // Member Variable

	Bike() { // Constructor
		this(5);
	}

	Bike(int speed) { // Constructor
		this.speed = speed;
	}

	Bike(String name) { // Constructor
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // Local Variable
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		} else {
			System.out.println("Error speed is not valid, setting default speed as 0");
		}
	}

	void start() {
		System.out.println("Started " + this.name);
	}

	void increaseSpeed(int newspeed) {
		setSpeed(this.speed + newspeed);
	}

	void decreaseSpeed(int newspeed) {
		setSpeed(this.speed - newspeed);
	}

	void stop() {
		System.out.println("Stopped " + this.name);
	}
}
