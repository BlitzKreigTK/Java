package com.oop.objectComposition;

public class PersonMain {

	public static void main(String[] args) {

		Address home = new Address("Colony 3", "Patna", 800025);
		Person person = new Person("Tulsi", home);
		System.out.println(person.toString());

		Address work = new Address("Sector 137", "Noida", 201305);
		person.setWorkAddr(work);
		System.out.println(person.toString());
	}
}
