package com.valtech.training.hibernate.Client;

//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import com.valtech.training.hibernate.*;

public class HibernateClient {
	
	public static void main(String[] args) throws HibernateException, ParseException {
//		DateFormat df =  new SimpleDateFormat("dd-MM-yyyy");
		AnnotationConfiguration cfg = new AnnotationConfiguration();
//		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Tx.class).addAnnotatedClass(ChequeTx.class).addAnnotatedClass(TellerTx.class).addAnnotatedClass(AtmTx.class);
		cfg.addAnnotatedClass(Customer.class).addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Account.class);
		cfg.addAnnotatedClass(Registration.class);
		cfg.addAnnotatedClass(OrderSummary.class);
		cfg.addAnnotatedClass(OrderSummaryId.class);
		SessionFactory sesFac = cfg.buildSessionFactory();
		Session ses = sesFac.openSession();
		Transaction tx = ses.beginTransaction();
		
		
		
		
//		ses.persist(new BankAccount(new BankAccountID("SB",1),3000));
//				
//		BankAccountID id = new BankAccountID("SB",1);
//		BankAccount ba = (BankAccount) ses.load(BankAccount.class, id); 
		
		
//		Customer cus = new Customer("ABC",23);
//		ses.save(cus);
//		Address add = new Address("RR Nagar","Bangalore",560098);
//		add.setCustomer(cus);
//		ses.save(add);
//		
//		Account acc = new Account(10000, "SBI");
//		Tx tx1 = new Tx(1000);
//		Tx tx2 = new ChequeTx(2000,123123,34435);
//		Tx tx3 = new TellerTx(3000,123,345);
//		Tx tx4 = new AtmTx(5000,789);
//		
//		Account acc1 = new Account(10000, "SBI");
//		Tx tx5 = new ChequeTx(2000,4564556,345124);
//		
//		Customer cus1 = new Customer("Def",25);
//		ses.save(cus1);
//		Address add1 = new Address("Byatarayanapura","Banglore",560056);
//		add1.setCustomer(cus1);
//		ses.save(add1);
//		Customer cus2 = new Customer("Pqr",27);
//		ses.save(cus2);
//		Address add2 = new Address("MG Road","Banglore",560026);
//		add2.setCustomer(cus2);
//		ses.save(add2);
//		
//		ses.persist(acc);
//		ses.persist(tx1);
//		ses.persist(tx2);
//		ses.persist(tx3);
//		ses.persist(tx4);
//		
//		ses.persist(acc1);
//		ses.persist(tx5);
//		ses.persist(cus1);
//		ses.persist(cus2);
//		ses.persist(add1);
//		ses.persist(add2);
//		
//		acc.addTx(tx1);
//		acc.addTx(tx2);
//		acc.addTx(tx3);
//		acc.addTx(tx4);
//		
//		acc1.addTx(tx5);
//		acc1.addCustomer(cus1);
//		acc1.addAddress(add1);
//		acc1.addCustomer(cus);
//		acc.addCustomer(cus);
//		acc.addCustomer(cus1);
//		acc1.addAddress(add1);
//		acc.addCustomer(cus2);
//		acc1.addAddress(add2);
		
//		ses.createQuery("select distinct tx.account from Tx tx").list().forEach(t->System.out.println(t));
		
//		org.hibernate.Query query = ses.createQuery("select distinct c from Customer c join c.accounts a join a.txs t where t.account > ?");
//		query.setFloat(0, 1000);
//		query.list().forEach(t->System.out.println(t));
		
//		org.hibernate.Query query = ses.createQuery("select t from Tx t join t.account.customers c where c.address.city = ? and t.amount = ?");
//		query.setString(0, "Bangalore");
//		query.setFloat(1, 10000);
//		query.list().forEach(t->System.out.println(t));
//		ses.save(new Tx(1000));
//		ses.save(new ChequeTx(2000,123123,34435));
//		ses.save(new TellerTx(3000,123,345));
//		ses.save(new AtmTx(5000,789));
//		
//		ses.createQuery("from Tx tx").list().forEach(t->System.out.println(t));
		
		
//		int id = (Integer)ses.save(new Employee("Dhanush", df.parse("30-4-2016"), 45000, 'M', true));
		System.out.println("Loading...");
		tx.commit();
		ses.close();
		sesFac.close();
		
	}

}