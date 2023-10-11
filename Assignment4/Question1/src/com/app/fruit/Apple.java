package com.app.fruit;
public class Apple extends Fruits {
	
public Apple() {
	this("white", 0, "", false);

		// TODO Auto-generated constructor stub
	}
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
public void accept() {
	System.out.println("Enter for Apple");
	super.accept();
}
public String taste() {
	return "sweet n sour";
}

/*public String toString() {
	return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + ", sc=" + sc
			+ "]";
}*/

}
