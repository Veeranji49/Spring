package com.bean.emp;

public class Employe {
	int id;
	String name;
	double salary;
	
	Employe(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void details()
	{
		System.out.println("Employee id:"+this.id);
		System.out.println("Employee name:"+this.name);
		System.out.println("Employee salary:"+this.salary);
	}

}
