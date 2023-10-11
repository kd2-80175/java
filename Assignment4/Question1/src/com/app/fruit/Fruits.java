package com.app.fruit;

import java.util.Scanner;

public class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh;

	public Scanner sc = new Scanner(System.in);

	public Fruits() {
		this("white", 0, "", true);

	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		if (this.isFresh) {
			return true;
		}

		return false;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

//	@Override
//	public String toString() {
//		String str = "\"Fruits [color=\" + color + \", weight=\" + weight + \", name=\" + name + \"]\"z;
//		return str;
//	}

	public String taste() {
		return "NO SPECIFIC TASTE";
	}
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + ", sc="
				+ sc + "]";
	}

	public void accept() {
		System.out.println("Enter the color of fruit: ");
		this.color = sc.next();
		System.out.println("Enter weight of fruit: ");
		this.weight = sc.nextDouble();
		System.out.println("Enter name of fruit: ");
		this.name = sc.next();

	}
}
