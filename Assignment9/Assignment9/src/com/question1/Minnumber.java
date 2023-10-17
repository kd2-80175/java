package com.question1;
import java.lang.*;
public class Minnumber {
static<T extends Number>T findMin(T[] arr){
	T ele=arr[0];
	for(T e:arr)
		if(ele.doubleValue()>e.doubleValue()) {
			ele=e;
		}
	return ele;
}
public static void main(String[] args) {
	Integer[] arr1 = { 22, 55, 77, 11, 33 };
	Integer min1 = findMin(arr1);
	Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
	Double min2 = findMin(arr2);
	System.out.println(min1+" min1 "+min2+" min2");
}
}
