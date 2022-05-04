package com.qp.sonar_demo;
//https://www.guru99.com/junit-tutorial.html
//https://www.sonarqube.org/downloads/
//https://fluvid.com/videos/detail/BMm-ri-1kLuPG21LO#.YmOPVV9Rebk.link
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator calc;
	@BeforeClass
	public static void beforeClass() {
		calc=new Calculator();
		System.out.println("before all methods...");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after all methods...");
	}
	@Before
	public void before() {
		System.out.println("before every test method");
	}
	
	@After
	public void after() {
		System.out.println("after every test method..");
	}
	@Test
	public void test() {
		//Calculator calc=new Calculator();
		int result=calc.add(10,10);
		assertEquals(20,result);
		
	}

	@Test
	public void test2() {
		//Calculator calc=new Calculator();
		int result=calc.mul(10,10);
		assertEquals(100,result);
	}
}
