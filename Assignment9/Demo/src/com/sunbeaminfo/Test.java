package com.sunbeaminfo;

import java.util.Arrays;
import java.util.Comparator;

//import com.question3.Students;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students[] arr=new Students[5];
		arr[0]=new Students(2,"Ujjwal","Lucknow",99);
		arr[1]=new Students(1,"Prerna","Patna",100);
		arr[2]=new Students(5,"Ritu","Silvasa",90);
		arr[3]=new Students(3,"Ojaswi","Indore",80);
		arr[4]=new Students(4,"Sonu","Patna",89);
		
		System.out.println("Before Sort: ");
		for (Students s : arr)
			System.out.println(s);
		
		// sort by empno -- Comparable
		//Arrays.sort(arr);
	
		System.out.println("After Sort by Empno: ");
		for (Students s : arr)
			System.out.println(s);
		
		class StdNameComparator implements Comparator<Students> {

			@Override
			public int compare(Students s1, Students s2) {
				// TODO Auto-generated method stub
				int diff = -s1.getCity().compareTo(s2.getCity());
				if(diff==0) {
					diff=-1*(int)(s1.getMarks()-s2.getMarks());
				}
				if(diff==0)
				diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		StdNameComparator nameComparator = new StdNameComparator();
		//Arrays.sort(arr, nameComparator);
		Arrays.sort(arr, nameComparator);
		System.out.println("After Sort by Name: ");
		for (Students s1 : arr)
			System.out.println(s1);

	}

}
