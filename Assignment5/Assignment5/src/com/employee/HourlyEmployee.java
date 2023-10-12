package com.employee;

public class HourlyEmployee extends Employee {
	private int wage;
	private int hours;
public HourlyEmployee() {
	super();
	this.hours=0;
	this.wage=0;
	}
public HourlyEmployee(int wage, int hours) {
	super();
	this.wage = wage;
	this.hours = hours;
}
public void accept() {
	super.accept();
	System.out.println("Enter the wages of employee: ");
	wage=sc.nextInt();
	System.out.println("Enter the hours of employee work: ");
	hours=sc.nextInt();
}
@Override
public void calculateTotalearning() {
	// TODO Auto-generated method stub
	if(this.hours<=40) {
		System.out.println("hourly salary: "+this.hours*this.wage);
	}
	else if(this.hours>40) {
		System.out.println("hourly salary: "+this.wage*40+(this.hours-40)*this.wage*1.5);
	}
}
@Override
public String toString() {
	return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", getSsn()=" + getSsn()
			+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


}
