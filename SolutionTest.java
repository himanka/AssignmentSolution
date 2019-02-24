package com.solution;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}

	@Test
	public void testSing() {
		bird.sing();
	}

}
