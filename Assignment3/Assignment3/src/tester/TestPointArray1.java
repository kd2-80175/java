package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;
public class TestPointArray1{
	public static Scanner sc=new Scanner(System.in);
	public static int menu() {
		int choice;
		System.out.println("************************");
		System.out.println("1. Display details of specific point");
		System.out.println("2. Display x,y co-ordinates of all points");
		System.out.println("3. Calculate distance between points");
		System.out.println("4. Exit");
		System.out.println("Select your Choice");
		choice=sc.nextInt()	;	
		System.out.println("**************************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		System.out.println("Enter the number of points to plot: ");
		int numPoint=sc.nextInt();
	
		
		Point2D[] points=new Point2D[numPoint];
		
		for(int i=0;i<numPoint;i++) {
			System.out.println("Enter x and y coordinates for point "+(i+1)+" : ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			points[i]=new Point2D(x,y);
			
			
		}
		do {
			choice=menu();
			switch (choice) {
			case 1: System.out.println("Enter the index of the point: ");
			        int index=sc.nextInt();
			        if(index>=0 && index<numPoint) {
			        	System.out.println("Details of the point"+index+": "+points[index].getDetails());
			        }
			        else {System.out.println("Invalid index.Please retry!");
			        }
				
				break;
			case 2: System.out.println("Coordinates of all points: ");
			        for(int i=0;i<numPoint;i++) {
			        	System.out.println("Point "+i+": "+points[i].getDetails());
			        }
			    break;
			case 3: System.out.println("Enter The Indices Of The Start And End Points: ");
			        int startIndex=sc.nextInt();
			        int endIndex=sc.nextInt();
			        if(startIndex>=0 && startIndex<numPoint && endIndex>=0 && endIndex<numPoint) 
			        {
			        	if(!points[startIndex].isEqual(points[startIndex],points[endIndex])) 
			        	{
			        	double distance=points[endIndex].calculateDistance(points[startIndex],points[endIndex]);
			        	System.out.println("Distance Between Point "+startIndex+" and point "+endIndex+" = "+distance);
			        	 }
			        	else System.out.println("Points are located at the same position ");
			        	
			        }
			        else System.out.println("Invalid Indices. Please retry!");
			        break;

			case 4: 
				   System.out.println("Thanks for using our app....");
				break;
			}
		}while(choice!=4);
		
	}
}