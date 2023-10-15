package com.assignment7;
//Q4. write a java program to count number of words in a String.
import java.util.Scanner;
public class Question4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String word="This is what it is";
	String arr[]=word.split(" ");
System.out.println("the number of words in a String: "+arr.length);
	
}
}
