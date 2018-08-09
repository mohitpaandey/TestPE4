package com.stackroute.demo.PE4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HarryTest {
private static Harry potter;
	
	@BeforeClass
	public static void setup() {
		
		potter = new Harry();
	
	}
	
	@AfterClass
	public static void teardown() {
		potter=null;
	}
	@Test
	public void toHagrid() {
		String s="This is Harry";
		String s4="Harry";
		boolean result=potter.tocheckWizard(s,s4);
		assertEquals(s4,result);
		
	}

	@Test
	public void toHelpHagrid() {
		String s="This is Henry";
		String s4="Harry";
		boolean result=potter.tocheckWizard(s,s4);
		assertNotEquals(s4,result);
		
	}
}
