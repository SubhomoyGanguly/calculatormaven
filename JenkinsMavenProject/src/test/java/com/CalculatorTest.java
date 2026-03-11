package com;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
	@Test
	void testAddition() {
		Calculator calc = new Calculator();
		int result = calc.add(1000,1000);
		assertEquals(2000, result);
	}

}
