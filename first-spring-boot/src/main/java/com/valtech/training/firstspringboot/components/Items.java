package com.valtech.training.firstspringboot.components;

public class Items {
	
	private int itemId;
	private String itemName;
	private int unitPrice;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Items() {
	}
	
	public Items(int itemId, String itemName, int unitPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}
	
	public Items(String itemName, int unitPrice) {
		super();
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", unitPrice=" + unitPrice + "]";
	}

}
