package org.GL.Idrissi;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@DisplayName("I'm a Test Class")
public class ImpUtilTest {
	
	ImpUtil iu = new ImpUtil();


	@Test
	@DisplayName("here a product")
	public void testProd() {
		assertEquals(24.0, iu.prod(4, 6) , 0.001 );	
		}

	@Test
	public void testDiv() {
		iu.div(6,2);
		//fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
        assertEquals(60, iu.addition(15, 45),0.001);					

	}

	@Test
	public void testSoustr() {
		  iu.soustr(19,78);	}

	@Test
	public void testPGCD() {
            assertEquals(15, iu.PGCD(15, 45));
	
	}

	@Test
	public void testFact() {
        assertEquals(120, iu.Fact(5));
		
	}

	@Test
	public void testBin() {
		assertEquals("1111", iu.bin(15));
	}
	
	@Test
	public void test_exception() {

        Exception exception = assertThrows(ArithmeticException.class, () -> {iu.div(1, 0);});

        assertEquals("/ by zero", exception.getMessage());

        assertTrue(exception.getMessage().contains("zero"));

    }
	
	@Test
	@Order(1)
	public void testEstPair(){
		assertTrue(iu.estPair(16));
	       System.out.println(true);	
		}
	
	

}
