package com.oop.AbstractInterface;

public class RecipeMain {

	public static void main(String[] args) {
		RecipeWithItem rec1 = new RecipeWithItem();
		rec1.make();
		RecipeWithMicroWave rec2 = new RecipeWithMicroWave();
		rec2.make();
	}

}
