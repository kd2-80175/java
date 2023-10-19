package com.solution3;
/*3. In above assignment use TreeSet instead of LinkedHashSet. 
 * Use natural ordering for the Book. 
 * If any book with duplicate isbn is added, what will happen?
Books are stored in which order?*/
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	public Scanner sc=new Scanner(System.in);
private String isbn;
private double price;
private String authorName;
private int qty;
public Book() {
	this("",0.0,"",0);
}
public Book(String isbn, double price, String authorName, int qty) {
	
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.qty = qty;
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
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}


@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", qty=" + qty + "]";
}
/*
 * @Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Book other = (Book) obj;
	if(other.getIsbn().equals(this.isbn))
		return true;
	return false;
}
public int hashCode() {
	int hash=Objects.hash(this.isbn);
	return hash;
}*/
@Override
public int compareTo(Book other) {
	int diff=this.isbn.compareTo(other.isbn);
	return diff;
}

}

