package SOLUTION;
import java.util.Scanner;
public class solution2 {
	/*public static void main(String[] args) {
double num1;
double num2;
double result;
Scanner scan=new Scanner(System.in);
System.out.println("Enter your number1");

 
    //Print Double value  
    if(scan.hasNextDouble()!=scan.hasNextInt()){  
    	num1=scan.nextDouble();
         
        System.out.println("**********************");
        System.out.println("Enter your number2");
        if(scan.hasNextInt()!=scan.hasNextInt()) {
       	 num2=scan.nextDouble();
       	result=(num1+num2)/2;
       	System.out.println("Average : "+result );
       	}
        else System.out.println("Num2 Is Not Double ");
    }
    else System.out.println("Num1 Is Not Double");*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("ENTER THE NUM1 OF DOUBLE TYPE :");

		if (sc.hasNextDouble() != sc.hasNextInt()) {
			num1 = sc.nextDouble();
			System.out.println("___________________________________");
			System.out.println("ENTER THE NUM2 OF DOUBLE TYPE :");

			if (sc.hasNextDouble() != sc.hasNextInt()) {
				num2 = sc.nextDouble();
				 double result = ((num1 + num2) / 2);
				System.out.println("AVERAGE OF NUM1 AND NUM2 :" + result);
			}

			else
				System.out.println("ENTERED NUMBER NUM2 IS NOT DOUBLE");

		}

		else
			System.out.println("ENTERED NUMBER NUM1 IS NOT DOUBLE");

	}
    
      
 
	}
 



