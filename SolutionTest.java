package com.solution;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Bird bird;
	Duck duck;
	Chicken chicken;
	Rooster rooster;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
		duck =  new Duck();
		chicken= new Chicken();
		rooster = new Rooster();
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
		rooster.fly();
		System.out.println("\n");
	}
}
