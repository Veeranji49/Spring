package com.bean;

public class Person {
	private int id;
	private String name;
	private double salary;
	
	public Person(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}

}
