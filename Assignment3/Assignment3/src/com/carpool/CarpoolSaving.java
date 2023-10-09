package com.carpool;
import java.util.Scanner;
public class CarpoolSaving {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
		int totalMiles;
		int gasolineCost;
		int milesPerGallon;
		int parkingFees;
		int tolls;
		int dailyDrivingCost;
		System.out.println("This Application Calculates Your Daily Driving Cost");
		System.out.println();
		System.out.println("Enter total miles: ");
		totalMiles=sc.nextInt();
		System.out.println("Enter Cost per Gallon of Gasoline: ");
		gasolineCost=sc.nextInt();
		System.out.println("Enter Average Miles per Gallon: ");
		milesPerGallon=sc.nextInt();
		System.out.println("Parking Fees per Day: ");
		parkingFees=sc.nextInt();
		System.out.println("Enter Tolls per Day: ");
		tolls=sc.nextInt();
		dailyDrivingCost=(totalMiles/milesPerGallon) * gasolineCost + parkingFees + tolls;
		System.out.println("\n");
		System.out.println("Your Daily Driving Cost is: "+dailyDrivingCost);
	}
}

