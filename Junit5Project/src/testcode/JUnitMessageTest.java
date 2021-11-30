package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import businesscode.JUnitMessage;

class JUnitMessageTest {

	String message="Java";
	
	JUnitMessage jm =new JUnitMessage(message);
	@Test
	void testJUnitMessage() {
		fail("Not yet implemented");
	}

	
	@Test
	void testPrintMessage() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintHiMessage() {
		message = "Hi " + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, jm.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	}

}
