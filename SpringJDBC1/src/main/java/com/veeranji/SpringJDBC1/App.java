package com.veeranji.SpringJDBC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veeranji.SpringJDBC1.BusinessLayer.EmployeeBusiness;
import com.veeranji.SpringJDBC1.BusinessLayer.EmployeeBusinessImpl;
import com.veeranji.SpringJDBC1.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("insertEmployee.xml");
    	EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl)context.getBean("employeeBusiness");
    	
    	Employee emp=new Employee(11,"purnima",12);
    	employeeBusiness.insertEmployee(emp);
    	System.out.println("Successfully Inserted");
    }
}
