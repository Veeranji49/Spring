package com.bean1;

public class Player {
	private int jerseyNo;
	private String name;
	private double Networth;
	private String Team;
	
	public Player(int jerseyNo,String name,double Networth,String Team)
	{
		this.jerseyNo=jerseyNo;
		this.name=name;
		this.Networth=Networth;
		this.Team=Team;
	}
	public int getJerseyNo()
	{
		return this.jerseyNo;
	}
	public String getName()
	{
		return this.name;
	}
	public double getNetworth()
	{
		return this.Networth;
	}
	public String getTeam()
	{
		return this.Team;
	}

}
