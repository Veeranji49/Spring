
package com.SetterInjection;

public class Games {
	private int players;
	private String gamename;
	private double gamefee;
	
	public void setPlayers(int players)
	{
		this.players=players;
	}
	public int getPlayers()
	{
		return this.players;
	}
	public void setGamename(String gamename)
	{
		this.gamename=gamename;
	}
	public String getGamename()
	{
		return this.gamename;
	}
	public void setGamefee(double gamefee)
	{
		this.gamefee=gamefee;
	}
	public double getGamefee()
	{
		return this.gamefee;
	}

}
