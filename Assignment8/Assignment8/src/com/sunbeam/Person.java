package com.sunbeam;

import java.util.Scanner;
public class Person implements Displayable{
	public Scanner sc=new Scanner(System.in);
	private String name;
	public Person() {
		this.name="";
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void accept() {
		System.out.println("Enter Your Good Name: ");
		name=sc.next();
	}
	@Override
	public String toString() {
		return "Person [ name=" + name + "]";
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("name: "+name);
	}
	
		
	}
