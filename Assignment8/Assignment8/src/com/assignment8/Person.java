package com.assignment8;
/* author "Prerna"
 * 
 */
import java.util.Scanner;
public class Person {
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
		return "Person [sc=" + sc + ", name=" + name + "]";
	}
	
		
	}


