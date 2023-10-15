package com.assignment7;
/*Declare two Arrays of type String.
 *  Find the duplicate values of an array of string values.
 */
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		String arr[] = {"Sam","Joe","Robby","Harry"};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
       String arr1[] = {"Joe","Ram","Harry","Robby"};
		Arrays.sort(arr1);
		System.out.println("***Below are the duplicate values***");
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
				System.out.println("the values are: "+arr1[j]);
			}
		}
}
	}
}
