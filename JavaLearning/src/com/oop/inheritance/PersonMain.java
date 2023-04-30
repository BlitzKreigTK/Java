package com.oop.inheritance;

public class PersonMain {

	public static void main(String[] args) {
		AddressWithInheritance addr = new AddressWithInheritance();
		addr.setName("Tulsi Kant");
		addr.setAge(25);
		addr.setAddr1("Sector 137");
		addr.setCity("Noida");
		addr.setZip(201305);
		System.out.println("Name = " + addr.getName() + ", " + addr.getAge()); // Parentclass Person
		System.out.println("Address [" + addr.getAddr1() + ", " + addr.getCity() + ", " + addr.getZip() + "]"); // Subclass
																												// Address
	}

}
