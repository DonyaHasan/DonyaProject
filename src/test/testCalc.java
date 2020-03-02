package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calc;

public class testCalc {

	@Before
	public void setUp()throws Exception {
		Calc obj = new Calc();
	}

	@Test
	public void test1() {
		Calc obj = new Calc();
		assertEquals(0,obj.add(-2,2));
	}
	@Test
	public void test2() {
		Calc obj = new Calc();
		assertEquals(4,obj.add(2,2));
	}
	@Test
	public void T3() {
		Calc obj = new Calc();
		assertEquals(-4,obj.add(-2,-2));
	}



}
