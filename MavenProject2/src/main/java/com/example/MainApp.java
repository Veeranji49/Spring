package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		// Load the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the bean using constructor injection
        MessageService messageService = (MessageService) context.getBean("MessageService");

        // Call a method on the injected bean
        messageService.printMessage();
    }

	}

