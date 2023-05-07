package com.cocurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteMain {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Ant");
		list.add("Cat");
		list.add("Bat");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
