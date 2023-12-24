package com.SetterInjection;

public class Sports {
	private String name;
	private int sports;
	private Games games;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSports(int sports)
	{
		this.sports=sports;
	}
	public void setGames(Games games)
	{
		this.games=games;
	}
	public void details()
	{
		System.out.println("name:"+this.name);
		System.out.println("sports:"+this.sports);
		System.out.println("Games:"+this.games.getPlayers()+","+this.games.getGamename()+","+games.getGamefee());
	}

}


