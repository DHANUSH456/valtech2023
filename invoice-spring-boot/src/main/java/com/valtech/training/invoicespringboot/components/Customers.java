package com.valtech.training.invoicespringboot.components;

public class Customers {
	private int id;
	private String fname;
	private String lname;
	private String phone;
	private String email;
	private int addr_id;
	private int order_id;
	
	
	public Customers(String fname, String lname, String phone, String email, int addr_id, int order_id) {
	
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.addr_id = addr_id;
		this.order_id = order_id;
	}
	public Customers(int id, String fname, String lname, String phone, String email, int addr_id, int order_id) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.addr_id = addr_id;
		this.order_id = order_id;
	}
	public Customers() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	

}
