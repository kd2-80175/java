package com.sunbeam.exception;
import java.util.Scanner;
public class Circle {
private double diameter;
private Point2D p1;

public Circle() {
	p1=new Point2D(0,0);
	diameter=100;
}

public Circle(double diameter, Point2D p1) {
	super();
	this.diameter = diameter;
	this.p1 = p1;
}

public double getDiameter() {
	return diameter;
}

public void setDiameter(double diameter){
	if(diameter<0) {
		throw new NegativeException();
	}
		this.diameter=diameter;
			
		}

public Point2D getP1() {
	return p1;
}

public void setP1(Point2D p1) {
	this.p1 = p1;
}



}
