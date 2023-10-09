package com.credit.limit.calculator;
import java.util.Scanner;
public class CreditCaluculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
int acc_no=1;
int balance;
int charges;
int credit_limit;
int newbal;
int credit;
while(acc_no!=0) {
	System.out.println();
	System.out.println("Enter Account Number: ");
	acc_no=sc.nextInt();
	
	System.out.println("Input Beginning Balance: ");
	balance=sc.nextInt();
	
	System.out.println("Input Total Charges: ");
	charges=sc.nextInt();
	
	System.out.println("Input Total Credits Limit: ");
	credit_limit=sc.nextInt();
	
	System.out.println("Input Total Credits: ");
	credit=sc.nextInt();
	
	newbal=balance+charges-credit;
	System.out.println("NEW BALANCE = "+newbal);
	if(newbal>credit_limit) {
		System.out.println("Credit Limit Exceeded");
		break;
	}
	}





	

}
}
