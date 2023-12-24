package com.spring.AutoWiring_2.Annotations;

public class Anji {

	private int num;
	private String location;
	private String course;
	
	public Anji() {}
	public Anji(int num,String location,String course)
	{
		this.num=num;
		this.location=location;
		this.course=course;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
