package com.oop.objectComposition;

public class Person {

	private String name;
	private Address homeAddr; // object composition
	private Address workAddr; // object composition

	public Person(String name, Address home) {
		this.name = name;
		this.homeAddr = home;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getWorkAddr() {
		return workAddr;
	}

	public void setWorkAddr(Address workAddr) {
		this.workAddr = workAddr;
	}

	@Override
	public String toString() {
		return String.format("Name = %s \n Home Address = %s \n Work Address = %s", name, homeAddr, workAddr);
	}
}
