package org.GL.Idrissi;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class UtilTest {

	
	static ImpUtil iu = new ImpUtil();

	static int cpt =0;
	
	@AfterEach
	public void incrCount() {
     cpt++;
   }
	
	@AfterAll
	public static void AfficheCount() {
		System.out.println("count tests : " + cpt);
   }
	
	@BeforeAll
	@DisplayName("test class ImpUtil")
	public static void classTest() {
		assertEquals("class org.GL.Idrissi.ImpUtil", iu.getClass().toString());
		System.out.println("class OK");
   }
	
	
	@RepeatedTest(10)
	@DisplayName("Repeat!")
   public void repeatedTest() {
		
		assertEquals(6, iu.repeatInt(), "not equal");
	}
	   
	
	
	
	
	@DisplayName("A parametrized Test for Pairs")
		@ParameterizedTest
	    @ValueSource(ints = {15, 236, 37})
	    public void isPairArray(int arg) {
	        assertTrue(iu.estPair(arg), "not Pair");
	    }	
	
	@Test
	public void testAdd() {
        assertEquals(60, iu.addition(15, 45),0.001);					

	}
	
}
