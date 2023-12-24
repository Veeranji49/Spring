package com.bean4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooksTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Books.xml");
		List<Books> books=(List<Books>)context.getBean("bookbean");
		for(Books b:books)
		{
			System.out.println("Name:"+b.getName());
			System.out.println("Cost:"+b.getCost());
			System.out.println("Author Name:"+b.getAuthorName());
			System.out.println();
		}
	}

}
