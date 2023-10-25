package com.valtech.training.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.valtech.training.day2.*;

class ArithmeticTest {
	
	private Arithmetic arithmetic;
	
	@BeforeEach
	void ArithmeticConstructor(){
		System.out.println("Init...");
		arithmetic = new Arithmeticimpl();
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("BeforeAll...");
	}
	
	@AfterEach
	void ArithmeticConstructor1(){
		System.out.println("Destroy..");
	}

	@AfterAll
	static void AfterAll(){
		System.out.println("AfterAll...");
	}
	
	@Test
	void testAdd() {
		assertEquals(5, arithmetic.add(2, 3));
		assertEquals(5, arithmetic.add(3, 2));
		assertEquals(5, arithmetic.add(5, 0));
		assertEquals(5, arithmetic.add(5, -0));
		assertEquals(-5, arithmetic.add(-2, -3));
		assertEquals(-5, arithmetic.add(-8, 3));	
//		fail("Not yet implemented");
	}

	@Test
	void testSub() {
//		fail("Not yet implemented");
	}

	@Test
	void testMul() {
//		fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		assertEquals(1.666, 5.0/3.0,001,"Value not in Range");
		assertEquals(2, arithmetic.div(4, 2));
		assertEquals(2, arithmetic.div(-6, -3));
		try {
			assertEquals(2, arithmetic.div(4, 0));
			fail("Should have Throws Arithmetic Exception");
		}catch(DivideByZeroException ex) {
			
		}
		
	}
	
	@Test
	void testDivByZero() {
		assertThrows(DivideByZeroException.class, ()->arithmetic.div(5, 0));
	}

}
