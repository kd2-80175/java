package com.question3;
import java.util.Arrays;
import java.util.Comparator;


public class Stutester {
public static void main(String[] args) {
	Students[] arr=new Students[5];
	arr[0]=new Students(2,"Ujjwal","Lucknow",99);
	arr[1]=new Students(1,"Prerna","Patna",100);
	arr[2]=new Students(5,"Ritu","Silvasa",90);
	arr[3]=new Students(3,"Ojaswi","Indore",80);
	arr[4]=new Students(4,"Sonu","Bhopal",89);
	
	System.out.println("Before Sort: ");
	for (Students s1 : arr)
		System.out.println(s1);
	Arrays.sort(arr);
	System.out.println("******************************");
	System.out.println("------After Sort------");
	//StudentComparator sComparator = new StudentComparator();
	//Arrays.sort(arr, sComparator);
	System.out.println("After Sort by Sal Asc: ");
	for (Students s1 : arr)
		System.out.println(s1);	
	
	
	class StudentComparator implements Comparator<Students> {

		@Override
		public int compare(Students s1, Students s2) {
			int diff=-s1.getCity().compareTo(s2.getCity());
			if(diff==0)
				diff=-(int)(s1.getMarks()-(s2.getMarks()));
			if(diff==0)
				diff=s1.getName().compareTo(s2.getName());
			
			return diff;
			
		}
		
	}
	
	StudentComparator student=new StudentComparator();
	Arrays.sort(arr,student);
	System.out.println("*********After sort**********");
	for(Students s1:arr)
		System.out.println(s1);
	

		
		
		
		
	}
	
	
	
}

