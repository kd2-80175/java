package com.solution3;

import java.util.Scanner;

public class TestFunctional {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}		
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int choice;
	double num1,num2;
	 double result;
	System.out.print("Enter First Number: ");
    num1=sc.nextDouble();
    System.out.println("Enter Second Number: ");
    num2=sc.nextDouble();
	do {
		System.out.println("--------------M E N U-------------");
		System.out.println("0. EXIT");
		System.out.println("1. Perform Addition");
		System.out.println("2. Perform Subtraction");
		System.out.println("3. Perform Multiplication");
		System.out.println("4. Perform Division");
		System.out.print("Enter Your Choice: ");
		choice=sc.nextInt();
		System.out.println("------------------------------------");
		switch(choice) {
	
		case 1:
			  calculate( num1, num2,(a,b) -> a+b);
			 
			  break;
		case 2:calculate( num1, num2,(a,b) -> a-b);
			
			break;
		case 3: calculate( num1, num2,(a,b) -> a*b);
			
			break;
		case 4:calculate( num1, num2,(a,b) -> a/b);
			
			break;
		}
	}while(choice!=0);
	System.out.println("Thank you");
	
}
}
