package com.stackroute.demo.PE4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParagraphTest {
	private static Paragraph4 trip;
	
	
	@BeforeClass
	public static void setup() {
		
		trip = new Paragraph4();

	}

	@AfterClass
	public static void teardown() {
		trip=null;
	}
	
	@Test
	public void toGetTans() {
		String s="nameistrue";
		assertEquals(s,trip.getTrans(s));
	}
	
	@Test
	public void toGetAgain() {
		String s1="abcdefgh";
		String s2="acedsfsd";
		String res=trip.getTrans(s2);
		assertNotEquals(s1,res);
	}
	
}


