package com.valtech.training.invoicespringboot.components;

public class Venders {
	private int id;
	private String name;
	private String email;
	private String phone;
	private int addr_id;
	private int item_id;

	public Venders() {
	}

	public Venders(int id, String name, String email, String phone, int addr_id, int item_id) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr_id = addr_id;
		this.item_id = item_id;
	}

	public Venders(String name, String email, String phone, int addr_id, int item_id) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr_id = addr_id;
		this.item_id = item_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

}
