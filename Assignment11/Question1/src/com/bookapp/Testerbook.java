package com.bookapp;
import java.util.*;
import java.util.HashSet;
public class Testerbook {
public static void main(String[] args) {
	Set<Book> set=new HashSet<>();
	set.add(new Book("a",200,"Ojaswi",1));
	set.add(new Book("b",400,"Sonam",2));
	set.add(new Book("c",600,"Manpreet",3));
	set.add(new Book("e",650,"Ojaswi",4));
	set.add(new Book("e",900,"Prerna",5));
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()) {
		Book b=itr.next();
		System.out.println(b);
	}
	
	//*************A N S W E R*******************
	//the output will contain dublicates as it does not contain hashcode.
	//books are stored in any order.
	//After using hashcode the dublication problem removed.
}
}
