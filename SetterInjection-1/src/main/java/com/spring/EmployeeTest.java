package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Employeeee.xml");
		Employee emp=(Employee)context.getBean("employeebean");
		System.out.println("Name:"+emp.getName());
		System.out.println("Contact:"+emp.getContact());
		System.out.println("Salary:"+emp.getSalary());
		System.out.println("Location:"+emp.getLocation());
	}
}
