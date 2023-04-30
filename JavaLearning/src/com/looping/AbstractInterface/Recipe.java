package com.looping.AbstractInterface;

abstract class Recipe {

	public void make() {
		getReady();
		prepare();
		cleanup();
	}

	abstract void getReady();

	abstract void prepare();

	abstract void cleanup();

}
