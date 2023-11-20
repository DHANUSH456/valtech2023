package com.valtech.training.invoicespringboot.components;

public interface OrderDescDAO {

	void createOrderDesc(OrderDescription orderDesc);

	long count();

	void deleteOrderDesp(int id);

	void updateOrderDesc(OrderDescription orderDesc);

	OrderDescription getOrderDescription(int id);

	

	
}
