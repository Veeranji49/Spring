package com.constructorInjection;

public class Address {
	private String Location;
	private double networth;
	
	public Address(String Location,double networth)
	{
		this.Location=Location;
		this.networth=networth;
	}
	public String getLocation()
	{
		return this.Location;
	}
	public double getNetworth()
	{
		return this.networth;
	}

}
