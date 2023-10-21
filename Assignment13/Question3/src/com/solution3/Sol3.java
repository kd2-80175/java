package com.solution3;
import java.util.*;
/*3. Write a program that inputs 4 lines and stored them in a text ﬁle. 
 * Use BuﬀeredWriter class.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Sol3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try(FileWriter ff=new FileWriter("file.txt")){
	try(BufferedWriter bf=new BufferedWriter(ff)){
	for(int i=0;i<=4;i++) {
		System.out.println("Enter a line: ");
		String line=sc.nextLine();
		bf.write(line);
		bf.newLine();
		}
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
	
}
