package com.spring.AutoWiring_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.AutoWiring_2.Annotations.Veeru;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring.xml");
        Veeru veeru=(Veeru)context.getBean("veerubean");
        veeru.details();
    }
}
