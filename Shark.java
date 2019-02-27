package com.solution;

public class Shark extends Fish {

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