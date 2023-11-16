package com.valtech.training.hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderSummaryId implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private int orderId;
	@Id
	private int itemId;
	
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
	
	public OrderSummaryId() {
	}
	
	public OrderSummaryId(int orderId, int itemId) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
	}
	

}
