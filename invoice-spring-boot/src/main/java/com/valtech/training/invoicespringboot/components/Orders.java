package com.valtech.training.invoicespringboot.components;


import org.springframework.stereotype.Component;

public class Orders {
	private int id;
	private String orderDate;
	private int cust_id;
	private int orderDesc_id;

	public Orders() {
	}

	public Orders(int id, String orderDate, int cust_id, int orderDesc_id) {
		this.id = id;
		this.orderDate = orderDate;
		this.cust_id = cust_id;
		this.orderDesc_id = orderDesc_id;
	}

	public Orders(String orderDate, int cust_id, int orderDesc_id) {
		this.orderDate = orderDate;
		this.cust_id = cust_id;
		this.orderDesc_id = orderDesc_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getOrderDesc_id() {
		return orderDesc_id;
	}

	public void setOrderDesc_id(int orderDesc_id) {
		this.orderDesc_id = orderDesc_id;
	}

}
