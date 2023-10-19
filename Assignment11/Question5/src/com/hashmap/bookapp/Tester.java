package com.hashmap.bookapp;
import java.util.Map.Entry;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String, Book> map = new HashMap<>();
		int choice;
		do {
			System.out.println("**********M E N U***********");
			System.out.println("0. EXIT");
			System.out.println("1. INSERT MAP");
			System.out.println("2. SHOW MAP");
			System.out.println("3. FIND IN MAP");
			System.out.println("ENTER YOUR CHOICE: ");
			choice=sc.nextInt();
			System.out.println("*******************");
			switch(choice) {
			case 1:Book b=new Book();
			         b.accept();
			         map.put(b.getIsbn(), b);
				break;
			case 2:Set<Entry<String,Book>>entries=map.entrySet();
			       for(Entry<String,Book>en :entries)
			    	   System.out.println(en.getKey()+" , "+en.getValue());
				
				break;
				
			case 3:System.out.print("Enter isbn to find: ");
				   String isbn = sc.next();
			       Book f = map.get(isbn);
			       System.out.println(f);
				break;
			}
		}while(choice!=0);
	}

}
