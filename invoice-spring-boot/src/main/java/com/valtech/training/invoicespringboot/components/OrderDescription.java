package com.valtech.training.invoicespringboot.components;

public class OrderDescription {
	private int id;
	private int quantity;
	private int item_id;
	private int order_id;

	public OrderDescription() {
	}

	public OrderDescription(int id, int quantity, int item_id, int order_id) {
		this.id = id;
		this.quantity = quantity;
		this.item_id = item_id;
		this.order_id = order_id;
	}

	public OrderDescription(int quantity, int item_id, int order_id) {
		this.quantity = quantity;
		this.item_id = item_id;
		this.order_id = order_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	
}
