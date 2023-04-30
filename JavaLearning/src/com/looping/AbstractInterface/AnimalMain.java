package com.looping.AbstractInterface;

abstract class Animal {
	abstract public void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() }; // Passing object as an array and then enhance looping.Polymorphism
		for (Animal animal : animals) {
			animal.bark();
		}
	}
}
