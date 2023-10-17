package com.sunbeaminfo;

public class Students {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students() {
		this(0,"","",0);
	}

	public Students(int roll, String name, String city, double marks) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	

}
