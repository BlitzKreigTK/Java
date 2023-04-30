package com.basic;

public class CharacterTypeMain {

	public static void main(String[] args) {
		CharacterType mychar = new CharacterType('2');
		System.out.println("Vowel : " + mychar.isVowel());
		System.out.println("Consonant : " + mychar.isConsonant());
		System.out.println("Is Digit between 0 and 9 : " + mychar.isDigit());
		System.out.println("Is Alphabet between A(a) and Z(z) : " + mychar.isAlphabet());
		System.out.println("LowerCase : " + mychar.printLowerCase());
		System.out.println("UpperCase : " + mychar.printUpperCase());
		CharacterType.printAllLowerCase(); // Static methods are called using Class name and not object
		CharacterType.printAllUpperCase(); // Static methods are called using Class name and not object
	}
}
