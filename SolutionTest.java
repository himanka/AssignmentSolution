package com.solution;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Bird bird;
	Duck duck;
	Chicken chicken;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
		duck =  new Duck();
		chicken= new Chicken();
	}

	@Test
	public void testBirdSing() {
		bird.sing();
	}
	
	@Test
	public void testDuckSwim() {
		duck.swim();
	}

	
	@Test
	public void testDuckSing() {
		duck.sing();
	}
	
	@Test
	public void testChickenSing() {
		chicken.sing();
	}
	
	@Test
	public void testChickenFly() {
		chicken.fly();
	}
}
