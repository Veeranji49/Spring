package com.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("list1.xml");
		List<Product> productList=(List<Product>)context.getBean("productList");
		for(Product p:productList)
		{
			System.out.println("Product Name:"+p.getName());
			System.out.println();
		}
	}

}
