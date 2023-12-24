package com.bean2;

public class JobSeeker {
	private int id;
	private String JobName;
	private String Location;
	private double salary;
	
	public JobSeeker(int id,String JobName, String Location,double salary)
	{
		this.id=id;
		this.JobName=JobName;
		this.Location=Location;
		this.salary=salary;
	}
	public int  getId()
	{
		return this.id;
	}
	public String getJobName()
	{
		return this.JobName;
	}
	public String getLocation()
	{
		return this.Location;
	}
	public double getSalary()
	{
		return this.salary;
	}
}
