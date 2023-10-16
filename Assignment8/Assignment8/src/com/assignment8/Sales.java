package com.assignment8;
import java.util.Scanner;
public class Sales extends Employee {
	private double weeklysalary;
	public Sales() {
		super();
		this.weeklysalary=0;
	}
	

	public Sales(double weeklysalary) {
		super();
		this.weeklysalary = 7000;
	}
	public void accept() {
		super.accept();
		System.out.println("Enter the weeklysalary of employee: ");
		this.weeklysalary=sc.nextInt();
		
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [weeklysalary=" + weeklysalary + "]";
	}


	public double getWeeklysalary() {
		return weeklysalary;
	}


	public void setWeeklysalary(double weeklysalary) {
		this.weeklysalary = weeklysalary;
	}


	@Override
	public void calculateTotalearning() {
		// TODO Auto-generated method stub
		System.out.println("Weekely salary: "+this.weeklysalary);
	}

}