package com.assignment8;
import java.util.Scanner;
abstract public class Employee extends Person{
		public Scanner sc=new Scanner(System.in);
	private int empid;
	private double salary;
	
	public Employee() {
		this(0,0);
	}
	public Employee(int empid,double salary) {
		this.empid=empid;
		
		this.salary=salary;
	}
	public void accept() {
		System.out.println("Enter empid");
		this.empid=sc.nextInt();
		
		System.out.println("Enter Social security number: ");
		this.salary=sc.nextInt();
		super.accept();
		
	}

	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	abstract public void calculateTotalearning();
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", getName()=" + getName() + "]";
	}
	
	
	

	
}

