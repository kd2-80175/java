package com.assignment7;
//Write a java program to reverse a String

import java.io.*;
import java.util.Scanner;
public class Question2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("Enter Your Good Name: ");
	name=sc.next();
	System.out.println("the length of string: "+name.length());
	char rev[]=name.toCharArray();
	for(int i=rev.length-1;i>=0;i--) {
		System.out.print(rev[i]);
	}
	
	
	
}
}
