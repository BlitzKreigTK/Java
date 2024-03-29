package com.oop.inheritance;

public class SuperPerson {
	private String name;
	private int age;

	public SuperPerson(String name) {
		System.out.println("Supper Class");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name = %s, Age = %d", name, age);
	}
}
