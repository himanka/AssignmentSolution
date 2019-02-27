package com.solution;

public class Duck extends Bird {

	@Override
	void sing() {
		System.out.println("Duck sings Quack, quack");
	}

	void swim() {
		System.out.println("Duck is swiming.");
	}
}