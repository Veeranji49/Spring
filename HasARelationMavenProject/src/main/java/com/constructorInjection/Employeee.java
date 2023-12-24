package com.constructorInjection;

public class Employeee {
	private int id;
	private String name;
	private Address addres;
	
	public Employeee(int id,String name,Address addres)
	{
		this.id=id;
		this.name=name;
		this.addres=addres;
	}
	public void details()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("Address:"+addres.getLocation()+","+addres.getNetworth());
		
	}

}
