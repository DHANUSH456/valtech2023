package com.valtech.training.invoicespringboot.components;

public interface OrderDAO {

	void createOrder(Orders order);

	long count();

	void deleteOrder(int id);

	void updateOrder(Orders order);

	Orders getOrder(int id);

}
