package com.sunbeam;
import java.util.Scanner;
public class Date implements Displayable{
	public Scanner sc=new Scanner(System.in);
private int hours;
private int min;
private int sec;
public Date() {
	this(0,0,0);
}
public Date(int hours,int min,int sec) {
	this.hours=hours;
	this.min=min;
	this.sec=sec;
}
public void accept(){
	System.out.println("Enter hours: ");
	hours=sc.nextInt();
	System.out.println("Enter min: ");
	min=sc.nextInt();
	System.out.println("Enter sec: ");
	sec=sc.nextInt();
	
}
@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("hours: "+this.hours);
	System.out.println("minutes: "+this.min);
	System.out.println("Enter second: ");
	sec=sc.nextInt();
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}
public int getSec() {
	return sec;
}
public void setSec(int sec) {
	this.sec = sec;
}
@Override
public String toString() {
	return "Date [hours=" + hours + ", min=" + min + ", sec=" + sec + "]";
}


}
