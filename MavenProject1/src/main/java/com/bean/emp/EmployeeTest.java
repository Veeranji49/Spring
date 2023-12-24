package com.bean.emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Mybeans.xml");

	        Employee2 employee = (Employee2)context.getBean("employee");
	        System.out.println("Employee ID: " + employee.getEmpId()) ;
	        context.close();
	    }


	}


