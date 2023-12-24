package com.spring;

public class Employee {
	private String name;
	private int num;
	private double fees;
	
	public Employee(String name,int num, double fees)
	{
		this.name=name;
		this.num=num;
		this.fees=fees;
	}
	public void details()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Num:"+this.num);
		System.out.println("Fees:"+this.fees);
	}

}
