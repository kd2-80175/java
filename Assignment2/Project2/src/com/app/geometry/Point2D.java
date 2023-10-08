package com.app.geometry;
import java.lang.*;
import java.util.Scanner;
public class Point2D {
int x;
int y;
public Point2D() {
	this.x=0;
	this.y=0;
}
public Point2D(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public int getX_axis() {
		return x;
	}

	public void setX_axis(int x) {
		this.x = x;
	}

	public int getY_axis() {
		return y;
	}

	public void setY_axis(int y) {
		this.y = y;
	}
public String getDetails() {
		String result = "Point(x , y) = (" + x + " , " + y + ")";
		System.out.println(result);
		return result;
	}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x: ");
	this.x=sc.nextInt();
	System.out.println("Enter y: ");
	this.y=sc.nextInt();
}
public Boolean isEqual(Point2D p1, Point2D p2) {
		if (p1.getX_axis() == p2.getX_axis() && p1.getY_axis() == p2.getY_axis()) {
			System.out.println("Both points are equal.");
			return true;
		} else
			return false;
	}
	public void calculateDistance(Point2D p1, Point2D p2) {
		if(isEqual(p1,p2)) {
			System.out.println("Distance cannot be calculated...as points are equal.");
		}else {
		double result = Math.sqrt(Math.pow((p2.getX_axis() - p1.getX_axis()),2)+Math.pow((p2.getY_axis() - p1.getY_axis()),2));
		System.out.println("Distance between 2 points = "+result);
		}
	}


}
