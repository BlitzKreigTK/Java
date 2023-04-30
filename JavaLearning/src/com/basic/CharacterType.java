package com.basic;

public class CharacterType {
	private char ch;

	CharacterType(char ch) {
		this.ch = ch;
	}

	boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	boolean isDigit() {
		if (ch > 47 && ch < 57)
			return true;
		return false;
	}

	boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) // 'a' to 'z'
			return true;
		if (ch >= 65 && ch <= 90) // 'A' to 'Z'
			return true;
		return false;
	}

	char printLowerCase() {
		if (isAlphabet())
			ch = Character.toLowerCase(ch);
		return ch;
	}

	char printUpperCase() {
		if (isAlphabet())
			ch = Character.toUpperCase(ch);
		return ch;
	}

	public static void printAllLowerCase() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printAllUpperCase() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
