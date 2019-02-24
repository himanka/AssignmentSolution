package com.solution;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Bird bird = new Bird(); bird.walk(); bird.fly(); bird.sing();
		 */
	}

}

abstract class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am Singing");
	}
}

class SuperRoosterChicken extends Bird {

	@Override
	void fly() {
	}

}

class Chicken extends SuperRoosterChicken {

	@Override
	void sing() {
		System.out.println("Chicken sings Cluck, cluck");

	}

}

class Duck extends Bird {

	@Override
	void sing() {
		System.out.println("Duck sings Quack, quack");
	}

	void swim() {
		System.out.println("Duck is swiming.");
	}
}

class Rooster extends SuperRoosterChicken {
	@Override
	void sing() {
		System.out.println("Rooster sings Cock-a-doodle-doo");
	}
}
