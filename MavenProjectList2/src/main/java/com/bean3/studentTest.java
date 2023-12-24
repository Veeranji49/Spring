package com.bean3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Students.xml");
		
		List<Student> student=(List<Student>)context.getBean("studentbean");
		for(Student s:student)
		{
			System.out.println("Rollno:"+s.getRollno());
			System.out.println("Name:"+s.getName());
			System.out.println("fees:"+s.getFees());
			System.out.println("ishealthy:"+s.getIshealthy());
			System.out.println();
		}
	}

}
