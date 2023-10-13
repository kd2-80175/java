package com.sunbeam.exception;
import java.util.Scanner;
public class Testercircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d;
		
		Circle c1;
		c1=new Circle();
		
		System.out.println("Enter diameter: ");
		try {
			d = sc.nextDouble();
			c1.setDiameter(d);
		}
		catch(NegativeException n) {
			System.out.println("the diameter should be non-negative");
		}

	}

}
