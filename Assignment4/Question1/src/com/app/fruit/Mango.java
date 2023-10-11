package com.app.fruit;

public class Mango extends Fruits {

	public Mango() {
		this("white", 0, "", false);
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		System.out.println("Enter for Mango");
		super.accept();
	}

	public String taste() {
		return "sweet";
	}

	/*@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + ", sc=" + sc
				+ "]";
	}*/

}
