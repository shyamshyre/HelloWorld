package com.shyam.manytoone;

public class Address {
	
	private long address_id;
	private String addres_street;
	private String address_city;
	private String address_state;
	private String address_zipcode;
	public Address(String street, String city, String state, String zipcode) {
		
		this.addres_street = street;
		this.address_city=city;
		this.address_state=state;
		this.address_zipcode = zipcode;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public String getAddres_street() {
		return addres_street;
	}
	public void setAddres_street(String addres_street) {
		this.addres_street = addres_street;
	}
	public String getAddress_city() {
		return address_city;
	}
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}
	public String getAddress_state() {
		return address_state;
	}
	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}
	public String getAddress_zipcode() {
		return address_zipcode;
	}
	public void setAddress_zipcode(String address_zipcode) {
		this.address_zipcode = address_zipcode;
	}
	
	

}
