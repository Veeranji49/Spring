package com.family;

public class family {
	private String name;
	private int no;
	private double networth;
	
	family(String name,int no,double networth)
	{
		this.name=name;
		this.no=no;
		this.networth=networth;
	}
	void delay()
	{
		System.out.println(this.name);
		System.out.println(this.no);
		System.out.println(this.networth);
	}

}
