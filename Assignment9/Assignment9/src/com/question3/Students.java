package com.question3;

import java.util.Comparator;

public class Students{
private int roll;
private String name;
private String city;
private double marks;
public Students() {
	this(0,"","",0);
}
public Students(int roll, String name, String city, double marks) {
	super();
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
//public class StudentComparator implements Comparator<Students> {
//	@Override
//	public int compare(Students s1, Students s2) {
//		int diff=-s1.getCity().compareTo(s2.getCity());
//		if(diff==0)
//			diff=-(int)(s1.getMarks()-(s2.getMarks()));
//		if(diff==0)
//			diff=s1.getName().compareTo(s2.name);
//		
//		return diff;
//	}}

}


