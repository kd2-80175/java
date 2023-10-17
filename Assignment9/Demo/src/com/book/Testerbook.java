package com.book;
import java.util.*;
import java.util.ArrayList;
public class Testerbook {
private static final int case1 = 0;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=1;
	
		do {
			System.out.println("****************************");
			System.out.println("______MENU_______");
			
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete at book given index -- list.remove(index)");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order -- list.sort()");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			System.out.println("****************************");
			
			switch(choice){
			case1 : List<Book> list=new ArrayList<>();
			          
			         
			}
		}while(choice!=0);
		
		
	}
}

