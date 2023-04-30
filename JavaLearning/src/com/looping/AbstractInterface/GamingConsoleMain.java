package com.looping.AbstractInterface;

public class GamingConsoleMain {

	public static void main(String[] args) {
		System.out.println("--------------------- Mario Game ---------------------");
		MarioGame gc = new MarioGame(); // Interface using subclass object
		gc.moveUp();
		gc.moveDown();
		gc.moveLeft();
		gc.moveRight();
		System.out.println("--------------------- Chess Game ---------------------");
		GamingConsole gcmain = new ChessGame(); // Interface using parent class object
		gcmain.moveUp();
		gcmain.moveDown();
		gcmain.moveLeft();
		gcmain.moveRight();
	}

}
