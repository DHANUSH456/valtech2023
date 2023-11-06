package com.valtech.training.invoice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.valtech.training.Address;
import com.valtech.training.Customers;
import com.valtech.training.Items;
import com.valtech.training.OrderDescription;
import com.valtech.training.Orders;
import com.valtech.training.Vendors;

public class HibernateInvoice {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Vendors.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Customers.class);
		cfg.addAnnotatedClass(Orders.class);
		cfg.addAnnotatedClass(Items.class);
		cfg.addAnnotatedClass(OrderDescription.class);
		SessionFactory sesFac = cfg.buildSessionFactory();
		Session ses = sesFac.openSession();
		Transaction tx = ses.beginTransaction();
		
		Address address = new Address(24,"Javaregowda Nagar","Bangalore","Karnataka","India",560098);
		Address address1 = new Address(24,"Byatarayana pura","Bangalore","Karnataka","India",560026);
		
		Vendors vendors = new Vendors("dhanush.v.2001@gmail.com","9480208384","Dhanush");
		address.setVendors(vendors);
		vendors.setAddress(address);
		
		Customers customers=new Customers("Murali", "K R", 1234, "murali@gamil.com");
		customers.setAddress(address1);
		address1.setCustomers(customers);
		
		Items items = new Items("Iphone 15","It is IOS phone", 100000);
		items.setVendors(vendors);
		
		OrderDescription orderDescription = new OrderDescription(1);
		orderDescription.setItems(items);
		
		Orders orders = new Orders("06-11-2023");
		orders.setCustomers(customers);
		orders.setOrderDescription(orderDescription);
		
		ses.persist(address);
		ses.persist(address1);
		ses.persist(vendors);
		ses.persist(customers);
		ses.persist(items);
		ses.persist(orderDescription);
		ses.persist(orders);
		
		System.out.println("Loading...");
		tx.commit();
		ses.close();
		sesFac.close();
	}
}
