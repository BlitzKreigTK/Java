package com.oop.objectComposition;

public class Review {
	private int id;
	private String desc;
	private int rating;

	public Review(int id, String desc, int rating) {
		this.id = id;
		this.desc = desc;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "[Id = " + id + ", Desc = " + desc + ", Rating " + rating + "]";
	}
}
