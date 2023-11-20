package com.valtech.training.invoicespringboot.components;
public class Address {
	private int id;
	private int buildNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private int zipcode;

	public Address() {

	}

	public Address(int id, int buildNo, String street, String city, String state, String country, int zipcode) {
		this.id = id;
		this.buildNo = buildNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;

	}

	public Address(int buildNo, String street, String city, String state, String country, int zipcode) {
		this.buildNo = buildNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuildNo() {
		return buildNo;
	}

	public void setBuildNo(int buildNo) {
		this.buildNo = buildNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
