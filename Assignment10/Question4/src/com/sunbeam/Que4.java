package com.sunbeam;
import java.util.*;
import java.util.Collection;

public class Que4 {
public static void main(String[] args) {
	//Collection<String> c=new ArrayList<>();
	//Collection<String> c=new HashSet<>();
	//Collection<String> c=new LinkedHashSet<>();
	Collection<String> c = new TreeSet<>();

	c.add("B");
	c.add("D");
	c.add("A");
	c.add("C");
	c.add(null);
	c.add(null);
	c.add(null);
	System.out.println(c.toString());
	//OUTPUT:
	//[B, D, A, C, null, null, null] in arraylist.
	
	//[null, A, B, C, D] in Hashsetl.
	//[B, D, A, C, null] in LinkedHashSet.
	//Exception
}
}
