package com.question2;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class Max {
public static void main(String[] args) {
	List<String> list=new ArrayList();
	list.add("Apparna");
	list.add("Priyanka");
	list.add("Ojaswi");
	list.add("Sonam");
	list.add("Manpreet");
	System.out.println("********List Of Strings********");
	for(String e:list)
		System.out.println(e);
	class StrComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			int diff=s1.length()-s2.length();
			return diff;
		}
		
	}
	StrComparator comparator=new StrComparator();
	System.out.println("Max String is : "+Collections.max(list, comparator));
}
}
