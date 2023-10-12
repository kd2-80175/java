package com.employee;

public class Tester {
public static void main(String[] args) {
	Employee e1=new SalariedEmployee();
	e1.accept();
	e1.calculateTotalearning();
	e1.toString();
	System.out.println("********************");
	System.out.println();
	e1=new HourlyEmployee();
	e1.accept();
	e1.calculateTotalearning();
	e1.toString();
	System.out.println("********************");
	System.out.println();
	e1=new BasePlusCommission();
	e1.accept();
	e1.calculateTotalearning();
	e1.toString();
	
	
}
}
