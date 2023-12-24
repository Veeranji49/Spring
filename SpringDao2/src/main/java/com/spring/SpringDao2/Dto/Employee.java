package com.spring.SpringDao2.Dto;

public class Employee {
	 private int id;
	 private String name;
	 private int fees;
	 private String location;
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
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(int id, String name, int fees, String location) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.location = location;
	}
	 
	 public Employee() {}

}
