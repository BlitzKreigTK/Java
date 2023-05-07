package com.javaTips;

class Player {
	private String name;
	private static int count = 0;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	static int getCount() {
		return count;
	}

	public Player(String name) {
		this.name = name;
		count++;
	}
}

public class StaticMain {
	public static void main(String[] args) {
		Player p1 = new Player("Dhoni");
		System.out.println(Player.getCount());
		Player p2 = new Player("Sachin");
		System.out.println(Player.getCount());
		System.out.println(p1.getName() + " & " + p2.getName() + " are " + Player.getCount() + " GOAT players");
	}
}
