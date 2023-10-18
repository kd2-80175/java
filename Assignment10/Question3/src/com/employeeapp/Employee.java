package com.employeeapp;
import java.util.*;
public class Employee {
int empid;
String name;
double salary;
public Employee() {
	this(0,"",0);
}
public Employee(int empid, String name, double salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void accept() {
	System.out.println("Enter the employee id: ");
	setEmpid(new Scanner(System.in).nextInt());
	System.out.println("Enter the employee name: ");
	setName(new Scanner(System.in).next());
	System.out.println("Enter the employee salary: ");
	setSalary(new Scanner(System.in).nextInt());
	}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	return Objects.hash(empid, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	
	Employee other = (Employee) obj;
	return empid == other.empid ;
			

}

}
