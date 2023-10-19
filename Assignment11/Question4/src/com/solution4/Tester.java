package com.solution4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



import java.util.NavigableSet;

public class Tester {
	public static void main(String[] args) {
		class BookComparator implements Comparator<Bookmap>{

			@Override
			public int compare(Bookmap b1, Bookmap b2) {
				int diff=-Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
			
		}
		BookComparator b=new BookComparator();

		TreeSet<Bookmap> set=new TreeSet<>(b);
		set.add(new Bookmap("a",200,"Ojaswi",1));
		set.add(new Bookmap("b",400,"Sonam",2));
		set.add(new Bookmap("d",600,"Manpreet",3));
		set.add(new Bookmap("e",650,"Ojaswi",4));
		set.add(new Bookmap("e",900,"Prerna",5));
		set.add(new Bookmap("c",550,"Ritu",2));
		Iterator<Bookmap> itr1=set.iterator();
		while(itr1.hasNext()) {
			Bookmap b1=itr1.next();
			System.out.println(b1);
		}
		System.out.println("****************descendingIterator*******************");
		Iterator<Bookmap> itr=set.descendingIterator();
		while(itr.hasNext()) {
			Bookmap b1=itr.next();
			System.out.println(b1);
		}
	}
}
