package com.junit.test;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@Test
	void testAddMethod()
	{
		App app = new App();
		int actual = app.add(4, 5);
		assertEquals(9, actual , "addition is correct ");
		System.out.println("testAddMethod working ------ ");
	}
	
	@Test
	@DisplayName("testing String ")
	void testCheckString()
	{
		App app = new App();
		assertEquals("abc",  app.checkString("ABC") , "string is correct ");
		System.out.println("testCheckString working ------ ");
	}
	
	@Test
	void testCheckNull()
	{
		App app = new App();
		assertNull(app.checkNull(null) , "object is null ");
		System.out.println("testCheckNull working ------ ");
	}
	
	@Test
	void testSame()
	{
		App app = new App();
		assertSame(app.checkSame("Hello") , "Hello");
		System.out.println("testSame working ------ ");
	}
	
	@Test
	void testTrueFalse()
	{
		App app = new App();
		assertTrue(app.checkTrueFalse(10,5) , "test is true ");
		System.out.println("testTrueFalse working ------ ");
	}
	
	//static is imp
	@BeforeAll
	static void testBeforeAllMehtod()
	{
		System.out.println("beforeAll working fine ");
	}
	
	@Test
	void checkLinesMatch()
	{
		App app = new App();
		//assertLinesMatch(app.checkLinesMatch() , List.of("A","b","c","d","e") ,"lines is correct ");
		assertLinesMatch(app.checkLinesMatch() , List.of("A","b","c") ,"lines is correct ");
		System.out.println("checkLinesMatch working ------ ");
	}
	    
	//static is imp
	@AfterAll
	static void testAfterAllMehtod()
	{
		System.out.println("afterAll working fine ");
	}
	
	@BeforeEach
	void testBeforeEachMehtod()
	{
		System.out.println("BeforeEach working fine ");
	}
	
	@AfterEach
	void testAfterEachMehtod()
	{
		System.out.println("AfterEach working fine ");
	}
	
}
