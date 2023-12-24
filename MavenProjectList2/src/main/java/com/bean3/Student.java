package com.bean3;

public class Student {
	private int rollno;
	private String name;
	private double fees;
	private boolean ishealthy;
	
	public Student(int rollno,String name,double fees,boolean ishealthy)
	{
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
		this.ishealthy=ishealthy;
	}
	public int getRollno()
	{
		return this.rollno;
	}
	public String getName()
	{
		return this.name;
	}
	public double getFees()
	{
		return this.fees;
	}
	public boolean getIshealthy()
	{
		return this.ishealthy;
	}

}
