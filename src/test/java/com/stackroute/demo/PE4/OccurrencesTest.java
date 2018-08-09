package com.stackroute.demo.PE4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OccurrencesTest {

	private static Occurrences opt;
	
	@BeforeClass
	public static void setup() {
		
		opt = new Occurrences();

	}

	@AfterClass
	public static void teardown() {
		opt = null;
	}
	 
	@Test
	public void toGetTans() {
		String s="She sells seashells by the seashore";
		String s1="Found at: 4 - 6";
		assertEquals(s,opt.getOccur(s));
	}
	
	@Test
	public void toGetAgain() {
		String s1="abababcd";
		String s2="Found at:0 -5";
		String res=opt.getOccur(s2);
		assertNotEquals(s1,res);
	}
	
}
