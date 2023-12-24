package com.spring;
import java.util.*;

public class Player {

	private List<String> name;
	private List<Integer> matches;
	private List<Double> networth;
	private List<String> team;
	
	public void setName(List<String>name)
	{
		this.name=name;
	}
	public List<String> getName()
	{
		return this.name;
	}
	public void setMatches(List<Integer>matches)
	{
		this.matches=matches;
	}
	public List<Integer> getMatches()
	{
		return this.matches;
	}
	public void setNetworth(List<Double>networth)
	{
		this.networth=networth;
	}
	public List<Double> getNetworth()
	{
		return this.networth;
	}
	public void setTeam(List<String>team)
	{
		this.team=team;
	}
	public List<String> getTeam()
	{
		return this.team;
	}
}
