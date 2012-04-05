package com.shyam.manytoone.student;

import com.shyam.manytoone.Address;

public class Student {

	private long student_id;
	private String student_name;
	private Address address;
	
	public Student(String string, Address address1) {
	this.student_name =string;
	this.address = address1;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	
	
}
