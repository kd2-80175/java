package com.solution6;

import java.util.Scanner;
import java.util.stream.Stream;

/*6. Calculate the factorial of the given number using stream operations.*/
public class Fact {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter number to find factorial: ");
	num=sc.nextInt();
	Stream<Integer> str=Stream.iterate(1, x->x+1).limit(num);
	int result=str.reduce(1, (a,b)->a*b);
	System.out.println("Factorial: "+result);
}
}
