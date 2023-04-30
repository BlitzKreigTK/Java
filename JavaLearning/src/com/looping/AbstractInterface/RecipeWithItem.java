package com.looping.AbstractInterface;

public class RecipeWithItem extends Recipe {

	@Override
	void getReady() {
		System.out.println("Getting the raw items");
	}

	@Override
	void prepare() {
		System.out.println("Making the dish with raw items");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the table after dish is ready");
	}

}
