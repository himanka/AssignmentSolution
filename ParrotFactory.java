package com.solution;

public class ParrotFactory {

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