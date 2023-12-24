package com.bean4;

public class Books {
	private String name;
	private  int cost;
	private String AuthorName;
	
	public Books(String name,int cost,String AuthorName)
	{
		this.name=name;
		this.cost=cost;
		this.AuthorName=AuthorName;
	}
	public String getName()
	{
		return this.name;
	}
	public int getCost()
	{
		return this.cost;
	}
	public String getAuthorName()
	{
		return this.AuthorName;
	}

}
