package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpAddressTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Empaddress.xml");
		Employeee emp=(Employeee)context.getBean("employeebean");
		emp.details();
	}

}
