package com.spring;

public class Employee {

	private String name;
	private int contact;
	private double salary;
	private String location;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setContact(int Contact)
	{
		this.contact=contact;
	}
	public int getContact()
	{
		return this.contact;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return this.location;
	}
}
