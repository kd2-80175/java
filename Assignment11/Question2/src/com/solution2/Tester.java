package com.solution2;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
public class Tester {
	public static void main(String[] args) {
		Set<Bookapp> set=new LinkedHashSet<>();
		set.add(new Bookapp("a",200,"Ojaswi",1));
		set.add(new Bookapp("b",400,"Sonam",2));
		set.add(new Bookapp("d",600,"Manpreet",3));
		set.add(new Bookapp("e",650,"Ojaswi",4));
		set.add(new Bookapp("e",900,"Prerna",5));
		set.add(new Bookapp("c",550,"Ritu",2));
		Iterator<Bookapp> itr=set.iterator();
		while(itr.hasNext()) {
			Bookapp b=itr.next();
			System.out.println(b);
		}
	}
	//*************A N S W E R*******************
//dublicates are removed when we used the hashcode and equal.
	//books are stored in insertion order.
}
