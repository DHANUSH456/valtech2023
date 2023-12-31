package com.valtech.training.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(OrderSummaryId.class)
public class OrderSummary {

	@Id
	private int orderId;
	@Id
	private int itemId;
	private int quantity;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public OrderSummary() {
	}
	
	public OrderSummary(int orderId, int itemId, int quantity) {
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
}
