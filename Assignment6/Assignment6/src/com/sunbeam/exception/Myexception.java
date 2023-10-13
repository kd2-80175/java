package com.sunbeam.exception;
import java.util.Scanner;
public class Myexception {
public static void main(String[] args) throws ExceptionLineTooLong{
	String line;
	System.out.println("Enter the line to read: ");
	try {
	Scanner sc=new Scanner(System.in);
	line=sc.next();
	System.out.println("the length of string is: "+line.length());
	if(line.length()>80){
		throw new ExceptionLineTooLong();
	}
	}
	catch (ExceptionLineTooLong e) {
		e.display();
 	}
}
}
