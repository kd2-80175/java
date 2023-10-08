package Assignment2;
import java.util.Scanner;
class Employee{
String first_name,last_name;
double salary;
public Employee() {
	this.first_name="";
	this.last_name="";
	this.salary=0;
}
public Employee(String first_name, String last_name, double salary) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.salary = salary;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	if(salary>0) {
	this.salary = salary;
	}
	else {salary=0;}
}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name: ");
	this.first_name=sc.next();
	System.out.println("Enter the last name: ");
	this.last_name=sc.next();
	System.out.println("Enter the salary");
	this.salary=sc.nextDouble();
}
public void display() {
	System.out.println("The First Name: "+this.first_name);
	System.out.println("The Last Name: "+this.last_name);
	System.out.println(this.first_name+this.last_name);
	System.out.println("The salary: "+this.salary*12);
	
	}
public double raise_Salary(){
	salary=salary*0.1+salary;
	return this.salary;
}

}

public class EmployeeTest{
	public static void main(String[] args) {
		double new_Salary;
		Employee E1=new Employee();
		E1.accept();
		E1.display();
		 new_Salary=E1.raise_Salary();
		 System.out.println(" new salary of E1: "+new_Salary*12);
		 System.out.println("**************object2*************");
		Employee E2=new Employee();
		E2.accept();
		E2.display();
		new_Salary=E2.raise_Salary();
		System.out.println(" new salary of E2: "+new_Salary*12);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
