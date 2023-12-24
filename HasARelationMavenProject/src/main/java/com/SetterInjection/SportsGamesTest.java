package com.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportsGamesTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SportsGames.xml");
		Sports sp=(Sports)context.getBean("sportsbean");
		sp.details();
	}

}
