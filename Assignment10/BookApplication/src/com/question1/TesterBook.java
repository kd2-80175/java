package com.question1;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
public class TesterBook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Book> list=new ArrayList();
		int choice;
		do {
			
			System.out.println("***********M E N U**********");
			System.out.println("1. Add new book in List");
			//If book not present, then add a new book (hint - contains())
			//If book is present, increment its quantity.
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn (hint - indexOf())");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list (hint - Collections.reverseList())");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			System.out.println("************************************");
			switch(choice) {
			case 1: Book b=new Book();
			        b.accept();
			         if(list.contains(b)) {
			        	 System.out.println("present");
			        	  	int x =list.indexOf(b)	;
			        	  	int q=list.get(x).getQuant();
			        	  	list.get(x).setQuant(q+1);
			        	}
			         else
			               list.add(b);
			    break;
			case 2:for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			break;
			case 3: {String isbn;
			       System.out.println("enter isbn: ");
			       isbn=sc.next();
			        Book key=new Book();
			        key.setIsbn(isbn);
			        int index=list.indexOf(key);
			        if(index==-1) {
			        	System.out.println("not found");
			        }
			        else System.out.println("found");
			        }
			 break;
			case 4: int index;
			        System.out.println("Enter index: ");
			        index=sc.nextInt();
				 list.remove(index);
				 break;
			case 5: {String isbn;
		           System.out.println("enter isbn: ");
		             isbn=sc.next();
		             Book key=new Book();
		             key.setIsbn(isbn);
		             index=list.indexOf(key);
		            if(index==-1) {
		        	System.out.println("not found");
		        }
		            else {
		            	list.remove(index);
		            }
			}
			       break;
			case 6:{    Collections.reverse(list);
			        for(Book b1:list)
			        System.out.println(b1);}
			        break;
			}
		}while(choice!=0);
		
	}

}
