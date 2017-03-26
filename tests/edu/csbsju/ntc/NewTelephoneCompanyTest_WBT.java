package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }

	@Test
	public void testGetStartTime() {
		int expectedResult = 0;
		int result = ntc.getStartTime();
		assertEquals("Hours is" + expectedResult, expectedResult, result);
	}

	@Test
	public void testSetStartTime() {
		int expResult = 10;
		ntc.setStartTime(expResult);
		int result = ntc.getStartTime();
		assertEquals("Hours is" + expResult, expResult, result);
	}

	@Test
	public void testGetDuration() {
		int expectedResult = 0;
		int result = ntc.getDuration();
		assertEquals("Hours is" + expectedResult, expectedResult, result);
	}

	@Test
	public void testSetDuration() {
		int expResult = 10;
		ntc.setDuration(expResult);
		int result = ntc.getDuration();
		assertEquals("Hours is" + expResult, expResult, result);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeCharge() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double result = ntc.computeCharge();
		double expected = 1768.0;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expected = 1078.48;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expected = 1078.48;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		double expected = 1149.20;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		double expected = 1248.0;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		double expected = 1227.20;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		double expected = 20.80;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expected = 208.80;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expected = 208.80;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expected = 208.80;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		double expected = 2298.40;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expected = 2156.96;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double result = ntc.computeCharge();
		double expected = 1664.00;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		double expected = 41.60;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		double expected = 2454.4;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
	@Test
	public void testComputeCharge() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		double expected = 2496.0;
		assertTrue("Compute charge is working for this result" + expected, result == expected);
	}
	
}
