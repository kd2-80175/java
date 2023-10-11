package com.app.fruit;

public class Orange extends Fruits {

	public Orange() {
		this("white", 0, "", true);

		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	public void accept() {
		System.out.println("Enter for Orange");
		super.accept();
	}

	public String taste() {
		return "sour";
	}

	/*@Override
	public String toString() {

		return super.toString();
	}*/
}
