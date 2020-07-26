package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRunner{
	
	RemovingAInFirstTwoCharacters rm;
	@Before
	public void settingUp() throws Exception {
		rm =new RemovingAInFirstTwoCharacters();
	}

	@Test
	public void test() {
		assertEquals("BCD" ,rm.remove("ABCD"));
	}
	@Test
	public void test1() {
		assertEquals("CD" ,rm.remove("AACD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD" ,rm.remove("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("BBAA" ,rm.remove("BBAA"));
	}
	@Test
	public void test4() {
		assertEquals("aaBAA" ,rm.remove("aaBAA"));
	}
	@Test
	public void test5() {
		assertEquals("" ,rm.remove("A"));
	}
}