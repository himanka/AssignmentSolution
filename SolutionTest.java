package com.solution;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Bird bird;
	Duck duck;
	Chicken chicken;
	Rooster rooster;
	RoosterWithoutInheritance roosterWithoutInheritance;
	Shark shark;
	CorwFish crowFish;
	Dolphine dolphine;
	Butterfly butterfly;
	Caterpillar caterpiller;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
		duck = new Duck();
		chicken = new Chicken();
		rooster = new Rooster();
		roosterWithoutInheritance = new RoosterWithoutInheritance();
		shark = new Shark();
		crowFish = new CorwFish();
		dolphine = new Dolphine();
		butterfly = new Butterfly();
		caterpiller = new Caterpillar();
	}

	@Test
	public void testBirdSing() {
		System.out.println("test case testBirdSing");
		bird.sing();
		System.out.println("\n");
	}

	@Test
	public void testDuckSwim() {
		System.out.println("test case testDuckSwim");
		duck.swim();
		System.out.println("\n");
	}

	@Test
	public void testDuckSing() {
		System.out.println("test case testDuckSing");
		duck.sing();
		System.out.println("\n");
	}

	@Test
	public void testChickenSing() {
		System.out.println("test case testChickenSing");
		chicken.sing();
		System.out.println("\n");
	}

	@Test
	public void testChickenFly() {
		System.out.println("test case testChickenFly");
		chicken.fly();
		System.out.println("\n");
	}

	@Test
	public void testRoosterSing() {
		System.out.println("test case testRoosterSing");
		rooster.sing();
		System.out.println("\n");
	}

	@Test
	public void testRoosterFly() {
		System.out.println("test case testRoosterFly");
		rooster.fly();
		System.out.println("\n");
	}

	@Test
	public void testRoosterWithoutInheritanceSing() {
		System.out.println("test case testRoosterWithoutInheritanceSing");
		roosterWithoutInheritance.sing();
		System.out.println("\n");
	}

	@Test
	public void testRoosterWithoutInheritanceFly() {
		System.out.println("test case testRoosterWithoutInheritanceFly");
		roosterWithoutInheritance.fly();
		System.out.println("\n");
	}

	@Test
	public void testParrotWithDogs() {
		System.out.println("test case testParrotWithDogs");
		ParrotFactory.getInstance("LivingWithDogs").sing();
		System.out.println("\n");
	}

	@Test
	public void testParrotWithCats() {
		System.out.println("test case testParrotWithCats");
		ParrotFactory.getInstance("LivingWithCats").sing();
		System.out.println("\n");
	}

	@Test
	public void testParrotWithRoosters() {
		System.out.println("test case testParrotWithRoosters");
		ParrotFactory.getInstance("LivingWithRooster").sing();
		System.out.println("\n");
	}

	@Test
	public void testSharkColorAndSize() {
		System.out.println("test case testSharkColorAndSize");
		shark.color();
		shark.size();
		System.out.println("\n");
	}

	@Test
	public void testSharkEat() {
		System.out.println("test case testSharkColorAndSize");
		shark.eat();
		System.out.println("\n");
	}

	@Test
	public void testCrowFishColorAndSize() {
		System.out.println("test case testSharkColorAndSize");
		crowFish.size();
		crowFish.color();
		System.out.println("\n");
	}

	@Test
	public void testCrowFishMakesJokes() {
		System.out.println("test case testSharkColorAndSize");
		crowFish.joke();
		System.out.println("\n");
	}

	@Test
	public void testDolphineSwim() {
		System.out.println("test case testDolphineSwim");
		dolphine.swim();
		System.out.println("\n");
	}

	@Test
	public void testButterflyFlying() {
		System.out.println("test case testButterflyFlying");
		butterfly.fly();
		System.out.println("\n");
	}

	@Test
	public void testCatepillerWalikng() {
		System.out.println("test case testButterflyFlying");
		caterpiller.walk();
		System.out.println("\n");
	}

	@Test
	public void testAnimalCount() {
		System.out.println("test case testAnimalCount");
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Shark(),
				new CorwFish(),
				new Butterfly()
				};
		int flyCount =0;
		int walkCount =0;
		int singCount =0;
		int swimCount =0;
		
		for (Animal animal :animals){
			flyCount += getMethod(animal,"fly");
			walkCount += getMethod(animal,"walk");
			singCount += getMethod(animal,"sing");
			swimCount += getMethod(animal,"swim");

		}
		System.out.println("No of animals who can walk is " + walkCount);
		System.out.println("No of animals who can fly is " + flyCount);
		System.out.println("No of animals who can sing is " + singCount);
		System.out.println("No of animals who can swim is " + swimCount);
		System.out.println("\n");
	}
	
	
	private int getMethod(Animal animal, String methodName){
		
		Method methodToFind = null;
		int count=0;
		
		  try {
			methodToFind = animal.getClass().getMethod(methodName, (Class<?>[]) null);
			if(methodToFind != null) {
				   count++;
			}
		} catch (NoSuchMethodException | SecurityException e) {		
		}
		  return count;
	}
}
