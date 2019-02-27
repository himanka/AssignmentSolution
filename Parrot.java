package com.solution;

public class Parrot extends Bird {
	String voice ="";

	Parrot(String voice) {
		this.voice = voice;
	}

	public Parrot() {

	}

	@Override
	public void sing() {
		System.out.println("Parrot sings " + voice);
	}
}