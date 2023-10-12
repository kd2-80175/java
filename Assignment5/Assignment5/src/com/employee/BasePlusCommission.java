package com.employee;

public class BasePlusCommission extends CommissionEmployee{
	private int baseSalary;
	
	
public BasePlusCommission() {
		super();
		this.baseSalary=0000;
	}


	public BasePlusCommission(double grossSales, double comm_Rate) {
		super(grossSales, comm_Rate);
		this.baseSalary=baseSalary;
	}
public void accept() {
	super.accept();
	System.out.println("Enter the base Salary: ");
	this.baseSalary=sc.nextInt();
}

public void calculateTotalearning() {
	System.out.println("Total Earning: "+(super.getComm_Rate()*super.getGrossSales())+this.baseSalary);
}


@Override
public String toString() {
	return "BasePlusCommission [baseSalary=" + baseSalary + ", sc=" + sc + ", toString()=" + super.toString()
			+ ", getGrossSales()=" + getGrossSales() + ", getComm_Rate()=" + getComm_Rate() + ", getSsn()=" + getSsn()
			+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}
