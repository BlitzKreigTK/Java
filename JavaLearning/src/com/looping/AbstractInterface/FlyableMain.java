package com.looping.AbstractInterface;

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("With wings");
	}
}

class AeroPlane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");
	}
}

public class FlyableMain {

	public static void main(String[] args) {
		Flyable[] type = { new Bird(), new AeroPlane() }; // Passing object as an array and then enhance looping
		for (Flyable object : type) {
			object.fly();
		}
	}
}
