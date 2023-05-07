package com.javaTips;

class DefaultOuterClass {

}

public class NestedClassMain {
	class DefaultNestedClass {

	}

	static class StaticNestedClass {

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DefaultOuterClass defaultOuterClass = new DefaultOuterClass();
		NestedClassMain nestedClassMain = new NestedClassMain();
		DefaultNestedClass defaultNestedClass = nestedClassMain.new DefaultNestedClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
	}
}
