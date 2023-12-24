package com.bean.anji;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnjiTest {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("anji.xml");
		Anji1 anj=(Anji1)context.getBean("anjibean");	
		System.out.println("Anji id:"+anj.getId());
		System.out.println("Anji name:"+anj.getName());
		System.out.println("Anji fees:"+anj.getFee());
		context.close();
	}

}
