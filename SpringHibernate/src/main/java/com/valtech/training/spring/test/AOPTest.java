package com.valtech.training.spring.test;
 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.valtech.training.spring.Arithmetic;
 
class AOPTest {
	
	ClassPathXmlApplicationContext appCtx;
	
	@BeforeEach
	void intitialized() {
		appCtx=new ClassPathXmlApplicationContext("aop.xml");
	}
	
	@AfterEach
	public void close() {
		 appCtx.close();
	}
 
	@Test
	void test() {
		Arithmetic arith=(Arithmetic) appCtx.getBean(Arithmetic.class);
		System.out.println(arith.getClass().getName());
		System.out.println(arith);
		assertEquals(5,arith.add(2, 3));
		assertEquals(4,arith.add(2, 2));
		assertEquals(-1,arith.sub(2, 3));
		try{
			arith.div(5, 0);
			fail("No Exception occured..");
		}catch (Exception e) {
			
		}
	}
 
}