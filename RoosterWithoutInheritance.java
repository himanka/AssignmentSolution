package com.solution;

public class RoosterWithoutInheritance implements RoosterBehavior {

	@Override
	public void sing() {
		System.out.println("Rooster sings Cock-a-doodle-doo");
	}

	@Override
	public void fly() {
	}

}