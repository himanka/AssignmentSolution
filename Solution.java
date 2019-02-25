package com.solution;

public class Solution {

	public static void main(String[] args) {
		
		Bird bird = new Bird(); bird.walk(); bird.fly(); bird.sing();
		 
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

class Butterfly extends Animal{
	@Override
	void walk() {
	}
	
	void fly() {
		System.out.println("Butterfly is  flying");
	}
	
}

abstract class Fish extends Animal {
	@Override
	void walk() {
	}

	abstract void size();

	abstract void color();

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

interface RoosterBehavior {

	void sing();

	void fly();
}

class RoosterWithoutInheritance implements RoosterBehavior {

	@Override
	public void sing() {
		System.out.println("Rooster sings Cock-a-doodle-doo");
	}

	@Override
	public void fly() {
	}

}

class Parrot extends Bird {
	String voice;

	Parrot(String voice) {
		this.voice = voice;
	}

	@Override
	public void sing() {
		System.out.println("Parrot sings " + voice);
	}
}

class ParrotFactory {

	static Parrot getInstance(String type) {
		switch (type) {
		case "LivingWithDogs":
			return new Parrot("Woof, woof");
		case "LivingWithCats":
			return new Parrot("Meow");
		case "LivingWithRooster":
			return new Parrot("Cock-a-doodle-doo");

		}
		return null;

	}

}

class Shark extends Fish {

	@Override
	void size() {
		System.out.println("Shark is large");

	}

	@Override
	void color() {
		System.out.println("Shark is of color Grey");

	}
	
	void eat(){
		System.out.println("Shark eats other fish");
	}

}

class CorwFish extends Fish {

	@Override
	void size() {
		System.out.println("CrowFish is small");

	}

	@Override
	void color() {
		System.out.println("CorwFish is of color Orange");

	}
	
	void joke(){
		System.out.println("CrowFish Makes jokes");
	}

}

interface Swimable{
	
	void swim();
}

class Dolphine implements Swimable{

	@Override
	public void swim() {
		System.out.println("Dolphine is swiming");
		
	}
	
}
