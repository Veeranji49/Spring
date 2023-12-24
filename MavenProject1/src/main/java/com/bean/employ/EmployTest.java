package com.bean.employ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployTest {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Mybeans2.xml");
		Employee3 employee=(Employee3)context.getBean("employeebean");
		System.out.println("Employee id:"+employee.getId());
		System.out.println("Employee name:"+employee.getName());
		System.out.println("Employee salary:"+employee.getSalary());
		context.close();
	}

}
