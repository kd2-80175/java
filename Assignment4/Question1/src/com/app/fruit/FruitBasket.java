package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("Enter choices: ");
		choice = sc.nextInt();
		System.out.println("************************");
		return choice;
	}

	public static void main(String[] args) {
        int index;
		int n;
		int choice;
		int count = 0;
		System.out.println("Enter the size of basket: ");
		n = sc.nextInt();
		Fruits f1[] = new Fruits[n];
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				if (count >= 0 && count < f1.length) {
					f1[count] = new Mango();
					f1[count].accept();
					System.out.println(f1[count].toString());
					count++;
				}
			}
				break;
			case 2: {
				if (count >= 0 && count < f1.length) {
					f1[count] = new Orange();
					f1[count].accept();
					System.out.println(f1[count].toString());
					count++;
				}
			}
				break;
			case 3: {
				if (count >= 0 && count < f1.length) {
					f1[count] = new Apple();
					f1[count].accept();
					System.out.println(f1[count].toString());

					count++;
				}
			}
				break;
			case 4:
				for (Fruits fruit : f1) {
					if (fruit != null) {
						String name = fruit.getName();
						System.out.println("name = " + name);
					}
				}

				break;
			case 5: {
				for (Fruits arr : f1) {
					if (arr != null) {
						if (arr.isFresh()) {
							System.out.println(arr.toString());
						
							System.out.println(arr.taste());

							System.out.println(arr.getName() + "fruit is fresh");
						}
					}
				}
			}
				break;
				
			case 6:{ 
				for(Fruits arr:f1) {
					if(arr!=null) {
						System.out.println("All fruit are fresh");
						break;
					}
					else {
						String taste=arr.taste();
						System.out.println(taste);
					}
				}
			}
			break;
			case 7:{
				    System.out.println("Enter index to ");
				    index=sc.nextInt();
				    if(index<f1.length && index>=0)
				    f1[index].setFresh(false);
				    else System.out.println("Invalid index");
			}
			break;
			case 8: for(Fruits fruit:f1) {
				if(fruit.taste().equals("sour")) {
					fruit.setFresh(false);
				}
			}
			break;
			
			}

		}
	}
}
