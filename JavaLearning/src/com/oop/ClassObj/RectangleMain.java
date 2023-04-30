package com.oop.ClassObj;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(25, 12);
		System.out.println(rectangle.toString());
		rectangle.setWidth(20);
		System.out.println(rectangle.toString());
	}

}
