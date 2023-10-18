package com.question1;

import java.util.Objects;
import java.util.Scanner;

public class Book {
String isbn;
double price;
String authorName;
int quant;
public Book() {
	this("",0,"",0);
}
public Book(String isbn, double price, String authorName, int quant) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quant = quant;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}
public void accept(){
	System.out.println("******WRITE DETAILS OF BOOK******");
	System.out.println("Enter isbn: ");
	setIsbn(new Scanner(System.in).next());
	System.out.println("Enter Author name: ");
	setAuthorName(new Scanner(System.in).next());
	System.out.println("Enter price: ");
	setPrice(new Scanner(System.in).nextDouble());
	System.out.println("Enter quantity: ");
	setQuant(new Scanner(System.in).nextInt());
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quant=" + quant + "]";
}
@Override
public int hashCode() {
	return Objects.hash(authorName, isbn, price, quant);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Book other = (Book) obj;
	if(other.getIsbn().equals(this.getIsbn()))
			return true;
	return false;
}


}


