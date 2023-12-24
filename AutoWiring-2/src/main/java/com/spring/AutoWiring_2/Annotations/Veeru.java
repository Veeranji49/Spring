package com.spring.AutoWiring_2.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Veeru {
	
	private int id;
	private String name;
	private double fees;
	
	@Autowired
	private Anji anji;
	
	public Veeru() {}
	public Veeru(int id,String name,double fees,Anji anji) {
		this.id=id;
		this.name=name;
		this.fees=fees;
		this.anji=anji;
	}
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Anji getAnji() {
		return anji;
	}
	public void setAnji(Anji anji) {
		this.anji = anji;
	}
	
	public void details()
	{
		System.out.println("Veeru:"+this.id+","+this.name+","+this.fees);
		System.out.println("Anji:"+this.anji.getNum()+","+this.anji.getCourse()+","+this.anji.getLocation());
	}

}
