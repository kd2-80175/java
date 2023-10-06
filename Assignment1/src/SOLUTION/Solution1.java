package SOLUTION;
import java.util.Scanner;
public class Solution1 {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	num=sc.nextInt();
	System.out.println("THE Wrapper class is going to be use:");
	 
    String num3 = Integer.toBinaryString(num);
    System.out.println("Binary value: "+num3);
    String num2=Integer.toOctalString(num);
    System.out.println("Octal value: "+num2);
    String num1 = Integer.toHexString(num);
    System.out.println("Hexadecimal value: "+num1);
    
}
}
