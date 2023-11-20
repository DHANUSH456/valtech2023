package com.valtech.training.invoicespringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.training.invoicespringboot.components.Address;
import com.valtech.training.invoicespringboot.components.AddressDAO;
import com.valtech.training.invoicespringboot.components.CustomerDAO;
import com.valtech.training.invoicespringboot.components.Customers;
import com.valtech.training.invoicespringboot.components.Items;
import com.valtech.training.invoicespringboot.components.ItemsDAO;
import com.valtech.training.invoicespringboot.components.OrderDAO;
import com.valtech.training.invoicespringboot.components.OrderDescDAO;
import com.valtech.training.invoicespringboot.components.OrderDescription;
import com.valtech.training.invoicespringboot.components.Orders;
import com.valtech.training.invoicespringboot.components.VenderDAO;
import com.valtech.training.invoicespringboot.components.Venders;

@SpringBootTest
class InvoiceSpringBootApplicationTests {
	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private ItemsDAO itemDAO;
	@Autowired
	private VenderDAO venderDAO;
	@Autowired
	private OrderDescDAO orderDescDAO;

	@Test
	void testAddressDAO() {
		Address address = new Address(8, 123, "SVG nagar", "Banglore", "Karnataka", "India", 560056);
		addressDAO.createAddress(address);
		assertEquals(8, addressDAO.count());
		addressDAO.getAddress(1);
		addressDAO.deleteAddress(1);;
		
	}

	@Test
	void testCustomerDAO() {
		Customers customer = new Customers(3, "Sneha", "Vijapur", "1234567890", "sneha@gmail.com", 1, 1);
		customerDAO.createCustomer(customer);
		assertEquals(2, customerDAO.count());
		customerDAO.getCustomer(1);
		customerDAO.deleteCustomers(1);
	}
	@Test
	void testOrderDAO() {
		Orders order = new Orders(3, "2023-11-14",1,1);
		orderDAO.createOrder(order);
		assertEquals(3, orderDAO.count());
		orderDAO.getOrder(1);
		orderDAO.deleteOrder(1);
	}
	@Test
	void testItemsDAO() {
		Items item =new Items (1,"Phone","Samsung S23",79000.00,1,1);
		itemDAO.createItems(item);
		assertEquals(1, itemDAO.count());
		itemDAO.getItems(1);
		itemDAO.deleteItems(1);
	}
	@Test
	void testVenderDAO() {
		Venders vender =new Venders (1,"Flifcart","flifcart.com","1234567890",2,1);
		venderDAO.createVender(vender);
		assertEquals(1, venderDAO.count());
	    venderDAO.deleteVender(1);
	    venderDAO.getVender(1);
	   
	}
	 @Test 
	 void testOrderDescDAO () {
		 OrderDescription orderDesc=new OrderDescription(2,2,1,1);
		 orderDescDAO.createOrderDesc(orderDesc);
		 assertEquals(1, orderDescDAO.count());
		 orderDescDAO.getOrderDescription(1);
		 orderDescDAO.deleteOrderDesp(1);
	 }

	
}
