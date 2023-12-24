package com.spring.SpringDao2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringDao2.Business.EmployeeBusiness;
import com.spring.SpringDao2.Business.EmployeeBusinessImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
    	EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl) context.getBean("employeeBusiness");
    	employeeBusiness.findAllEmployees();
    }
}
