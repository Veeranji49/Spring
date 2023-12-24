package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapPersonmain {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("maperson.xml");
		MapPerson mp=(MapPerson)context.getBean("personbean");
		System.out.println("Name:"+mp.getName());
		System.out.println("contact:"+mp.getContact());
		System.out.println("Salary:"+mp.getSalary());
	}

}
