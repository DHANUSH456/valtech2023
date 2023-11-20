package com.valtech.training.invoicespringboot.components;

public interface CustomerDAO {

	void createCustomer(Customers customer);

	long count();

	void deleteCustomers(int id);

	void updateCustomer(Customers customer);

	Customers getCustomer(int id);

	
}
