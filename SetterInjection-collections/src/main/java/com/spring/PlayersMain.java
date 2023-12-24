package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayersMain {
	
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("player.xml");
		Player play=(Player)context.getBean("playerbean");
		System.out.println("Name:"+play.getName());
		System.out.println("Matches:"+play.getMatches());
		System.out.println("Networty:"+play.getNetworth());
		System.out.println("Team:"+play.getTeam());
	}

}
