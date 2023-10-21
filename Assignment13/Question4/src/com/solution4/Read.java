package com.solution4;
/*4. Read a text ﬁle line by line and display on terminal. Hint: ﬁle --> FileReader --> BuﬀeredReader --> ...*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Read {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try(FileReader fr=new FileReader("/home/sunbeam/my_personal_git_data/java/Assignment13/Question3/file.txt")){
	try(BufferedReader br=new BufferedReader(fr)){
		
	String line;
	while((line=br.readLine())!=null) {
		System.out.println(line);
	}
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
