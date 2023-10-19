package com.solution4;
import java.util.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
/*4. Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). 
 * Display them using iterator()
 * and descendingIterator().*/
public class Bookmap implements Comparable<Bookmap> {
	public Scanner sc=new Scanner(System.in);
private String isbn;
private double price;
private String authorName;
private int qty;
public Bookmap() {
	this("",0.0,"",0);
}
public Bookmap(String isbn, double price, String authorName, int qty) {
	
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
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Bookmap other = (Bookmap) obj;
	if(other.getIsbn().equals(this.isbn) )
		return true;
	return false;
}
 

@Override
public int hashCode() {
	return Objects.hash(isbn, price);
}
@Override
public int compareTo(Bookmap other) {
	int diff=this.isbn.compareTo(other.isbn);
	return diff;
}

}

