package com.solution1;

public class Manager implements Emp{
	double basicSalary;
	double dearanceAllowance;

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		double result=basicSalary + dearanceAllowance;
		return result;
	}
	public double calcIncentives() {
		
		return 0.2*basicSalary;
	}

}
