package com.solution3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMap {
	public static void main(String[] args) {
		Set<Book> set=new TreeSet<>();
		set.add(new Book("a",200,"Ojaswi",1));
		set.add(new Book("b",400,"Sonam",2));
		set.add(new Book("d",600,"Manpreet",3));
		set.add(new Book("e",650,"Ojaswi",4));
		set.add(new Book("e",900,"Prerna",5));
		set.add(new Book("c",550,"Ritu",2));
		Iterator<Book> itr=set.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
	}
	 //*************A N S W E R*******************
//before comparable it was giving Exception as we have not written Comparable.
	//After using comparable dublicates were removed.
	//the elements are in sorted order.
}
