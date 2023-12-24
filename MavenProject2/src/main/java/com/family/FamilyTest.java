package com.family;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FamilyTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("family.xml");
		family f=(family)context.getBean("familybean");
		f.delay();
	}

}
