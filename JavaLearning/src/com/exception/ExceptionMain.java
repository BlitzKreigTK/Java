package com.exception;

public class ExceptionMain {
	public static void main(String[] args) {
		method1();
		System.out.println("Main call");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 call");
	}

	@SuppressWarnings("null")
	private static void method2() {
		System.out.println("Method2 call");
		try {
			String str = null;
			str.length();
			int[] i = { 1, 2, 3 };
			@SuppressWarnings("unused")
			int num = i[4];
			System.out.println("Try call");
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Found ArrayIndexOutOfBoundsException");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Found NullPointerException");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
