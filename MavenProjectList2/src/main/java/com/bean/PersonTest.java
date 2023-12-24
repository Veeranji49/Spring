package com.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("PersonsList.xml");
		
		List<Person> personsList=(List<Person>)context.getBean("personsList");
		
		for(Person p:personsList)
		{
			System.out.println("Person id:"+p.getId());
			System.out.println("Person name:"+p.getName());
			System.out.println("Person salary:"+p.getSalary());
		}
	}

}
