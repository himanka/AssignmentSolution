package com.solution;

public class Solution {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}

abstract class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}
