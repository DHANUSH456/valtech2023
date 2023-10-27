package com.valtech.training.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	
	static Stream<Arguments> addArgsGenrator(){
		return Stream.of(
				Arguments.of(1,2,3),
				Arguments.of(-1,-2,-3),
				Arguments.of(1,-2,-1),
				Arguments.of(-1,2,1)
				);
	}
	
	@ParameterizedTest(name = "Add With Method {0} + {1} = {2}")
	@MethodSource(value = {"addArgsGenrator"})
	void testWithMethods(int a, int b, int c) {
		assertEquals(c,arithmetic.add(a,b));
	}
	
	
	@ParameterizedTest(name = "Add With CSV {0} + {1} = {2}")
	@CsvSource(value = {"2,3,5","-2,3,1,","5,-2,3","-1,-1,-2"})
	void testWithCsvParams(int a, int b, int c) {
		assertEquals(c,arithmetic.add(a,b));
	}
	
	@ParameterizedTest(name = "Add With File {0} + {1} = {2}")
	@CsvFileSource(files = {"Add.csv"})
	void testWithCsvFile(int a, int b, int c) {
		assertEquals(c,arithmetic.add(a,b));
	}

	@ParameterizedTest(name = "Add With CSV {0} + {1} + {2}")
	@ValueSource(strings = {"2,3,5","-2,3,1,","5,-2,3","-1,-1,-2"})
	void testAddWithParams(String value) {
		String [] parts = value.split(",");
		List<Integer> values = Arrays.asList(parts).stream().map(it -> Integer.parseInt(it)).collect(Collectors.toList());
		assertEquals(values.get(2), arithmetic.add(values.get(0), values.get(1)));
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
