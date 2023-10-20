package com.solution5;



public class Test {
	public static<T> int countIf(T[] arr,T key,Check<T> c) {
		int count=0;
		for(T ele:arr) {
			if(c.compare(ele, key))
				count++;
		}
		return count;
	}
public static void main(String[] args) {
	Double[] arr= {1.1,1.2,1.3,1.2,1.5};
	Double key=1.2;
	int cnt=countIf(arr,key,(e,k)->e.equals(k));
	System.out.println("Count = " + cnt);
}
}
