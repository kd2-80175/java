package com.solution6;
/*6. Store Students in LinkedHashMap<> so that, for given roll, 
 * Student can be searched in fastest possible time.
 *  Do we need to write equals() and
hashCode() in Student class? Follow menu-driven approach.*/
import java.util.*;
public class Student {
int rollno;
String name;
int marks;
public Student() {
	this(0,"",0);
}
public Student(int rollno, String name, int marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public void accept() {
	System.out.print("Enter roll number: ");
	setRollno(new Scanner(System.in).nextInt());
	System.out.print("Enter your good name: ");
	setName(new Scanner(System.in).next());
	System.out.print("Enter marks: ");
	setMarks(new Scanner(System.in).nextInt());
}
/*public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(this==obj)
		return true;
	if(obj instanceof Student) {
		Student other=(Student)
	}
}*/
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}


}
