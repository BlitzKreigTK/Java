package com.oop.AbstractInterface;

public class ChessGame implements GamingConsole {

	@Override
	public void moveUp() {
		System.out.println("Move Up");
	}

	@Override
	public void moveDown() {
		System.out.println("Move Down");
	}

	@Override
	public void moveLeft() {
		System.out.println("Move left");
	}

	@Override
	public void moveRight() {
		System.out.println("Move Right");
	}
}
