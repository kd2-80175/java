package com.solution6;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;



public class Studenttest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Student> map = new LinkedHashMap<>();
		int choice;
		do {
			System.out.println("**********M E N U***********");
			System.out.println("0. EXIT");
			System.out.println("1. INSERT Student");
			System.out.println("2. Find Student");
			System.out.println("ENTER YOUR CHOICE: ");
			choice=sc.nextInt();
			System.out.println("*******************");
			switch(choice) {
			case 1:Student b=new Student();
			         b.accept();
			         map.put(b.getRollno(), b);
				break;
			case 2:System.out.print("Enter your roll no: ");
				int roll = sc.nextInt();
			Student s = map.get(roll);
			System.out.println(s);
				
				break;
				
			
			}
		}while(choice!=0);
	}


}
