package testcode;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;

public class CalculatorTest {
private Calculator calc;
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdd() {
		assumeTrue(5<1);
		double result=calc.add(10.50,10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	public void testSubtract() {
		assumeFalse(5<1);
		double result=calc.subtract(100.50,10.95);
		assertEquals(89.55,result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(100,2.5);
		
		String user="gosline";
		assumingThat(user.equals("raj"),()->assertEquals(500,result,0));
		assertEquals(250,result,0);
	}

	@Test(expected =ArithmeticException.class)
	public void testDivide() {
		calc.divide(100, 0);
	}

}
