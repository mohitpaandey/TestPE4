package com.stackroute.demo.PE4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransposeTest{
private static Transpose trans;
	@BeforeClass
	public static void setup() {
		
		trans = new Transpose();

	}

	@AfterClass
	public static void teardown() {
		trans=null;
	}
	
	@Test
	public void totestTrans() {
		String  s2="alfa is beta";
		String  s3="ateb si afla";
		String rese=trans.toTrans(s3);
		assertEquals(s2,rese);
		}
	
	@Test
	public void totheTrans() {
		String  s2="alfa is beta";
		String  s3="ateb is afla";
		String rese=trans.toTrans(s3);
		assertNotEquals(s2,rese);
		}	
	
	
	}
	
