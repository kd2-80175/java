package com.assignment7;
//Q3. Write a java code to check string is palindrome.
import java.io.*;
import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String word;
System.out.println("Enter the word");
word=sc.next();
String word1="";
for(int i=word.length()-1;i>=0;i--) {
	word1= word1 + word.charAt(i);
	}
if (word.equals(word1)) {
    System.out.println("Yes it is palindrome");
}
else System.out.println("nope...");
}
}

