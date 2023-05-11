package com.newAPIfeatures;

public class RecordsMain {
	record Person(String name, int age) {
		// Compact constructor
		Person {
			if (name == null) {
				throw new IllegalArgumentException("Invalid name");
			}
		}

		// Method
		public String name() {
			System.out.println("Do Something");
			return name;
		}
	}

	public static void main(String[] args) {
		// Person person = new Person(null, 25);
		// System.out.println(person);
		Person person1 = new Person("Tulsi", 25);
		System.out.println(person1);
	}
}
