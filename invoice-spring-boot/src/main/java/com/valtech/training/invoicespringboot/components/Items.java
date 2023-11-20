package com.valtech.training.invoicespringboot.components;

public class Items {
	private int id;
	private String itemName;
	private String description;
	private double unitPrice;
	private int vender_id;
	private int orderDesc_id;

	public Items() {
	}

	public Items(String itemName, String description,   double unitPrice, int vender_id, int orderDesc_id) {
		this.itemName = itemName;
		this.description = description;
		this.unitPrice = unitPrice;
		this.vender_id = vender_id;
		this.orderDesc_id = orderDesc_id;
	}

	public Items(int id, String itemName, String description, double unitPrice, int vender_id, int orderDesc_id) {
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.unitPrice = unitPrice;
		this.vender_id = vender_id;
		this.orderDesc_id = orderDesc_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVender_id() {
		return vender_id;
	}

	public void setVender_id(int vender_id) {
		this.vender_id = vender_id;
	}

	public int getOrderDesc_id() {
		return orderDesc_id;
	}

	public void setOrderDesc_id(int orderDesc_id) {
		this.orderDesc_id = orderDesc_id;
	}

}