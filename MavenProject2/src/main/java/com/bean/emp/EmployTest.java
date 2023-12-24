package com.bean.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Myemp.xml");
		Employe employe=(Employe)context.getBean("empbean");
		employe.details();
	}

}
