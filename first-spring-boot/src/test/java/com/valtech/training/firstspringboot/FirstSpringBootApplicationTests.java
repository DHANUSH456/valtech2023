package com.valtech.training.firstspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionMessage.ItemsBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.firstspringboot.components.Employee;
import com.valtech.training.firstspringboot.components.EmployeeDAO;
import com.valtech.training.firstspringboot.components.HelloWorld;
import com.valtech.training.firstspringboot.components.Items;
import com.valtech.training.firstspringboot.components.ItemsDAO;
//import com.valtech.training.firstspringboot.components.SimpleInterestimpl;
import com.valtech.training.firstspringboot.entity.Order;
import com.valtech.training.firstspringboot.service.EmployeeService;
import com.valtech.training.firstspringboot.service.OrderService;

@SpringBootTest
class FirstSpringBootApplicationTests {
	
	@Autowired
	private HelloWorld helloWorld;
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private OrderService orderService;
	
//	@Autowired
//	private SimpleInterestimpl simpleInterestimpl;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ItemsDAO itemsDAO;
	
//	@Test
//	void testSI() {
//		
//		simpleInterestimpl.computeInterest(2000, 4, 5);
//		System.out.println(simpleInterestimpl.computeInterest(2000, 4, 5));
//	}

	@Test
	void contextLoads() {
		assertNotNull(helloWorld);
		System.out.println(helloWorld.hello());
		assertEquals("Hello Spring Boot", helloWorld.hello());
	}
	
	@Test
	void testEmployeeDAO() {
		Employee employee = new Employee("pranav",22,1,1,45000);
		employeeDAO.createEmployee(employee);
		assertEquals(6, employeeDAO.count());
		System.out.println(employeeDAO.count());
		assertEquals(6, employeeDAO.getAllEmployees().size());
		System.out.println(employeeDAO.getAllEmployees());
	}

	@Test
	void testOrders() {
		Order o = orderService.createOrder(new Order("MACBOOK PRO",25,"For Entrie Team",LocalDate.of(2023, 10, 10)));
		assertNotEquals(0, o.getId());
		assertTrue(orderService.getAllOrders().size()>0);
	}
	
	void testEmployee() {
		
		employeeService.deleteEmployee(3);		
	}
	
	@Test
	void testItemsDAO(){
		
		Items items = new Items("pen",10);
		itemsDAO.createItems(items);
		assertEquals(4, itemsDAO.count());
		System.out.println(itemsDAO.count());
	}
}

