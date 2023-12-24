package com.Constructor2;

public class Input {
	private int id;
	private String name;
	private Output out;
	
	public Input(int id,String name,Output out)
	{
		this.id=id;
		this.name=name;
		this.out=out;
	}
	public void details()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+out.getLocation()+out.getSalary());
	}

}
