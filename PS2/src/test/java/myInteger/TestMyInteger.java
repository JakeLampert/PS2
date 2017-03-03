package myInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ps2.MyInteger;

public class TestMyInteger {
	static int odd;
	static int even;
	static int prime;
	static MyInteger iValue;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		odd = 1;
		even = 4;
		prime = 2;
		iValue = new MyInteger(5);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
 
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEven() {
		assertTrue(MyInteger.isEven(even));
		assertFalse(MyInteger.isEven(odd));
	}
	@Test
	public void isOdd() {
		assertTrue(MyInteger.isOdd(odd));
		assertFalse(MyInteger.isOdd(even));
	}
	@Test
	public void isPrime() {
		assertTrue(MyInteger.isPrime(prime));
		assertFalse(MyInteger.isPrime(even));
		
	}
	@Test
	public void getiValue() {
		assertEquals(iValue.getiValue(),5);
		
	}

}
