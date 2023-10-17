package com.book;
import java.util.*;
import java.util.ArrayList;
public class Testerbook {
private static final int case1 = 0;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=1;
	List<Book> list=new ArrayList<>();
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
			case 1 : Book book=new Book();
			        book.acceptBook();
			        list.add(book);
			    break;
			case 2: for(Book b:list)
				      System.out.println(b);
			    System.out.println();
			    break;
			case 3: int index;
			      System.out.println("Enter index at which u want to remove: ");
			      index=sc.nextInt();
				list.remove(index);
				break;
			case 4: System.out.println("Enter isbn: ");	
				String x=sc.next();
				Book key=new Book();
				key.setIsbn(x);
				System.out.println(list.contains(key));
			          break;
			case 5: list.clear();
			break;
			case 6: System.out.println("number of books: "+list.size());
			break;
			case 7: class Arrsort implements Comparator<Book>{

				@Override
				public int compare(Book b1, Book b2) {
					// TODO Auto-generated method stub
					int diff=Double.compare(b1.getPrice(),b2.getPrice());
					return diff;
					
				}
				
			}
			Arrsort arr=new Arrsort();
			list.sort(arr);
			
			         
			}
		}while(choice!=0);
		
		
	}
}

