package com.solution1;

public class Labour implements Emp {
double hours;
double rate;

public Labour(double hours, double rate) {
	super();
	this.hours = hours;
	this.rate = rate;
}
@Override
public double getSal() {
	return hours*rate;
}
public double calcIncentives() {
	if(hours>300)
	return 0.05*getSal();
	else return 0.0;
	}
}
