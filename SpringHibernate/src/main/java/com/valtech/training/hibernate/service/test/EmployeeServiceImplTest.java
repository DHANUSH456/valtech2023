package com.valtech.training.hibernate.service.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valtech.training.hibernate.Employee;
import com.valtech.training.hibernate.service.EmployeeServiceDAO;

class EmployeeServiceImplTest {
	
	private ApplicationContext appCtx;
	private DateFormat dateFormat;

	@BeforeEach
	void setUp() throws Exception {
		appCtx = new ClassPathXmlApplicationContext("tx2.xml");
		dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	}

	@AfterEach
	void tearDown() throws Exception {
		((AbstractApplicationContext) appCtx).close();
	}

	@Test
	void test() throws ParseException {
		Employee e =new Employee("Abc", dateFormat.parse("15-08-1947"), 10000, 'M', false);
		EmployeeServiceDAO dao=(EmployeeServiceDAO) appCtx.getBean("empSer");
//		EmployeeService empSer =  appCtx.getBean("empSer");
		e = dao.createEmployee(e);
		System.out.println(e);
		e = dao.incrementSalary(e, 2000);
		System.out.println(e);
		
	}

}

//java.lang.ClassCastException: class jdk.proxy2.$Proxy18 cannot be cast to class com.valtech.training.hibernate.service.EmployeeServiceImpl (jdk.proxy2.$Proxy18 is in module jdk.proxy2 of loader 'app'; com.valtech.training.hibernate.service.EmployeeServiceImpl is in unnamed module of loader 'app')



