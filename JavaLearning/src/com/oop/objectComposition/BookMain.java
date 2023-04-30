package com.oop.objectComposition;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book(123, "It starts with us", "Tulsi Kant"); // Book --> id, name, author
		book.addReview(new Review(10, "Great book", 5)); // Review --> id, desc, rating
		book.addReview(new Review(101, "Awesome", 5)); // Review --> id, desc, rating
		System.out.println(book.toString());
	}
}
