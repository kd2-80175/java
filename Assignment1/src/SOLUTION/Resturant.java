package SOLUTION;
import java.util.Scanner;
public class Resturant {
	
	public static int menu() {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("*******************************");
		System.out.println("0. Thanku for using app");
		System.out.println("1. Masala Dosa $100");
		System.out.println("2. Chiken Momos $75");
		System.out.println("3. Butter Chicken $250");
		System.out.println("4. Manchurian  $130 ");
		System.out.println("5. Egg Maggie  $99");
		System.out.println("6. Chicken Burger $180");
		System.out.println("7. Veg Meal $200");
		System.out.println("8. Chicken Biryani $280");
		System.out.println("9. Italian Pasta  $160");
		System.out.println("10. Genterate Bill");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		System.out.println("********************************");
		return choice;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int amount=0;
	int choice;
	int quantity;
	while((choice=menu())!=0) {
		switch(choice) {
		case 1:System.out.println("Enter for Masala ");
		        System.out.println("Enter Quantity You Want");
		        quantity=sc.nextInt();
		        amount=amount+quantity*100;
		 break;
		case 2:System.out.println("Chicken Momos");
		       System.out.println("Enter Quantity You Want");
                quantity=sc.nextInt();
               amount=amount+quantity*75;
        break;	
		case 3:System.out.println("Butter Chicken");
	           System.out.println("Enter Quantity You Want");
               quantity=sc.nextInt();
                amount=amount+quantity*250;
        break;
		case 4: System.out.println("Manchurian");
                System.out.println("Enter Quantity You Want");
                quantity=sc.nextInt();
                 amount=amount+quantity*130;
       break;
		case 5:System.out.println("Egg Maggie");
               System.out.println("Enter Quantity You Want");
               quantity=sc.nextInt();
                amount=amount+quantity*99;
		break;
		case 6:System.out.println("Chicken Burger");
               System.out.println("Enter Quantity You Want");
               quantity=sc.nextInt();
               amount=amount+quantity*180;
       break;
		case 7: System.out.println("Veg Meal");
                System.out.println("Enter Quantity You Want");
                 quantity=sc.nextInt();
                amount=amount+quantity*200;
        break;
		case 8: System.out.println("Chicken Biryani");
                System.out.println("Enter Quantity You Want");
                 quantity=sc.nextInt();
               amount=amount+quantity*280;
         break;
		case 9:  System.out.println("Italian Pasta");
                System.out.println("Enter Quantity You Want");
                quantity=sc.nextInt();
                amount=amount+quantity*180;
         break;
		 case 10: System.out.println("Total Bill : "+amount);
		break;
		 default: System.out.println("Oops you choose the wrong one");
          
		}
		
	}
	System.out.println("HOPE YOU ENJOYED OUR MEAL");
}
}
