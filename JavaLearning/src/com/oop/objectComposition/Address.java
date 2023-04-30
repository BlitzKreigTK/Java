package com.oop.objectComposition;

public class Address {

	private String addrline1;
	private String city;
	private int zip;

	public Address(String addrline1, String city, int zip) {
		this.addrline1 = addrline1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address line = " + addrline1 + " City = " + city + " Zip = " + zip;
	}
}
