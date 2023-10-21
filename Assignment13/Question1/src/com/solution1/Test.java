package com.solution1;
/*1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus.
 *  Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream.*/
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Test{
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
			System.out.println("7.Save Book In File");
			System.out.println("8.Load Book");
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
			case 7:{
				try(FileOutputStream fout=new FileOutputStream("BOOK.bin")){
					try(DataOutputStream dout=new DataOutputStream(fout)){
						for(Book b1:list) {
							dout.writeUTF(b1.getIsbn());
							dout.writeUTF(b1.getAuthorName());
							dout.writeDouble(b1.getPrice());
							dout.writeInt(b1.getQuant());
						}
					
				}//dout.close();
				
			}//fout.close();
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Book saved.");
			}
			break;
			case 8:{
				System.out.println("*******LOADING*********");
				try(FileInputStream fin=new FileInputStream("BOOK.bin")){
					try(DataInputStream din=new DataInputStream(fin)){
						while(true) {
							Book b2=new Book();
							b2.setIsbn(din.readUTF());
							b2.setAuthorName(din.readUTF());
							b2.setPrice(din.readDouble());
							b2.setQuant(din.readInt());
							System.out.println(b2);
						}
					}//din.close();
					
				}//fin.close();
				catch(EOFException e) {
					//do nothing
				}
				catch(Exception e) {
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					e.printStackTrace();
				}
				
			}
			break;
			}
		}while(choice!=0);
		
	}

}
