package com.oop.AbstractInterface;

public class MarioGame implements GamingConsole {

	@Override
	public void moveUp() {
		System.out.println("Jump");
	}

	@Override
	public void moveDown() {
		System.out.println("Down the pipe");
	}

	@Override
	public void moveLeft() {
		System.out.println("Nothing");
	}

	@Override
	public void moveRight() {
		System.out.println("Move forward");
	}

}
