package com.employee;

public class SalariedEmployee extends Employee {
	private double weeklysalary;
	public SalariedEmployee() {
		super();
		this.weeklysalary=0;
	}
	

	public SalariedEmployee(double weeklysalary) {
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


	@Override
	public void calculateTotalearning() {
		// TODO Auto-generated method stub
		System.out.println("Weekely salary: "+this.weeklysalary);
	}

}
