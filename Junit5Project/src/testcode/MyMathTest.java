package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;
import businesscode.MyMath;

public class MyMathTest {
	private MyMath m;
	@Before
	public void setUp() throws Exception {
		m= new MyMath();
		
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("test with 3 number");
		assertEquals(10, m.sum(new int[] {5,3,2}));
	}

	public void testSum2() {
		System.out.println("test with 5 number");
		assertEquals(101, m.sum(new int[] {5,3,2}));
	}
		
	}

