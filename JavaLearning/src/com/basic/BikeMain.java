package com.basic;

public class BikeMain {
	public static void main(String[] args) {
		Bike pulsar = new Bike(100);
		Bike honda = new Bike(100);
		// Bike ducati = new Bike();
		System.out.println("Initial Speed Pulsar --> " + pulsar.getSpeed());
		System.out.println("Initial Speed Honda --> " + honda.getSpeed());
		pulsar.setName("Pulsar 150cc");
		honda.setName("Hero Honda 100cc");
		pulsar.start();
		honda.start();
		pulsar.increaseSpeed(130);
		honda.increaseSpeed(100);
		System.out.println("Current Speed Pulsar --> " + pulsar.getSpeed());
		System.out.println("Current Speed Honda --> " + honda.getSpeed());
		pulsar.stop();
		honda.stop();
		pulsar.decreaseSpeed(150);
		honda.decreaseSpeed(100);
		System.out.println("Stopped Speed Pulsar --> " + pulsar.getSpeed());
		System.out.println("Stopped Speed Honda --> " + honda.getSpeed());
	}
}
