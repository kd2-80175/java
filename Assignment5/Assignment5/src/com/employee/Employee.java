package com.employee;
import java.util.Scanner;
abstract public class Employee {
	public Scanner sc=new Scanner(System.in);
private int ssn;
private String firstname;
private String lastname;
public Employee() {
	this(0,"","");
}
public Employee(int ssn,String firstname,String salary) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.ssn=ssn;
}
public void accept() {
	System.out.println("Enter first name");
	this.firstname=sc.next();
	System.out.println("Enter last name");
	this.lastname=sc.next();
	System.out.println("Enter Social security number: ");
	this.ssn=sc.nextInt();
}

public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
abstract public void calculateTotalearning();
@Override
public String toString() {
	return "Employee [ssn=" + ssn + ", firstname=" + firstname + ", lastname=" + lastname + "]";
}
}

