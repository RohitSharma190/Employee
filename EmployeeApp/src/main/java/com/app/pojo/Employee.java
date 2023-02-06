package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee extends BaseEntity {
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String email;
	@Column(length=100)
	private String Address;
	public Employee() {
		super();
	}
	public Employee(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		Address = address;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
