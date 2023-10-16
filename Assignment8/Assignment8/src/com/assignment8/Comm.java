package com.assignment8;
import java.util.Scanner;
public class Comm extends Employee{
	private double grossSales;
	private double comm_Rate;

	public Comm() {
		super();
		this.grossSales=0.0;
		this.comm_Rate=0.0;
	}

	public Comm(double grossSales, double comm_Rate) {
		super();
		this.grossSales = grossSales;
		this.comm_Rate = comm_Rate;
	}
public void accept() {
	super.accept();
	System.out.println("Enter the gross sales: ");
	this.grossSales=sc.nextDouble();
	System.out.println("Enter the Commission rate: ");
	this.comm_Rate=sc.nextDouble();
}




	@Override
	public void calculateTotalearning() {
		System.out.println("Total Earning: "+this.comm_Rate*this.grossSales);
		
	}

	@Override
	public String toString() {
		return "Comm [grossSales=" + grossSales + ", comm_Rate=" + comm_Rate + ", getEmpid()=" + getEmpid()
				+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + "]";
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getComm_Rate() {
		return comm_Rate;
	}

	public void setComm_Rate(double comm_Rate) {
		this.comm_Rate = comm_Rate;
	}
	

}