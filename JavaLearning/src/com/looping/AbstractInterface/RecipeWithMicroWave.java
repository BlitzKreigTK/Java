package com.looping.AbstractInterface;

public class RecipeWithMicroWave extends Recipe {
	@Override
	void getReady() {
		System.out.println("Getting the items");
	}

	@Override
	void prepare() {
		System.out.println("Switch on the microwave");
		System.out.println("Making the dish with raw items");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the table after dish is ready");
		System.out.println("Switch off the microwave");
	}
}
