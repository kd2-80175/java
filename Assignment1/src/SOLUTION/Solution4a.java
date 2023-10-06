
package SOLUTION;
/*
import java.util.Scanner; 
public class Solution4 {

	public static void main(String[] args) {
		String s="*";
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Enter the number");
		int num;
		num=scan.nextInt();
		for(int i=0;i<num;i++) {
			
			for(int j=num-1;j>=0;j--) {
				 
					System.out.print(" ");
			
				for(int k=0;k<=i;k++){
				System.out.print(s);
			}
			}
			System.out.print("\n");
		
	}
	}
}
*/

public class Solution4a {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" *");
			}
		System.out.println();
	}
     }
	}


	

	