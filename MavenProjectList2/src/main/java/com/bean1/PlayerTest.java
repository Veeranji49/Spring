package com.bean1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerTest {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Players.xml");
		
		List<Player> PlayerList=(List<Player>)context.getBean("playerList");
		
		for(Player p:PlayerList)
		{
			System.out.println("JerseyNo:"+p.getJerseyNo());
			System.out.println("Name:"+p.getName());
			System.out.println("Networth:"+p.getNetworth());
			System.out.println("Team:"+p.getTeam());
		}
	}

}
