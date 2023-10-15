package com.tdd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.tdd.dev.Factorial;

class FactorialTest {

	@Test
	void testFactorialOfZero() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(1, factorial.calculate(0));
	}
	
	@Test
	void testFactorialOfPositiveNumber() {
		Factorial factorial = new Factorial();
		Assertions.assertEquals(120, factorial.calculate(5));
	}
	
	@Test
	void testFactorialOfNegativeNumber() {
		Factorial factorial = new Factorial();
		Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.calculate(-5));
	}
}
