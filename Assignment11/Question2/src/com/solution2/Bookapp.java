package com.solution2;
/*2. In above assignment use LinkedHashSet instead of HashSet. 
 * If any book with duplicate isbn is added, what will happen? 
 * Books are stored in which order?*/
import java.util.Objects;
import java.util.Scanner;
public class Bookapp {
	public Scanner sc=new Scanner(System.in);
	private String isbn;
	private double price;
	private String authorName;
	private int qty;
	public Bookapp() {
		this("",0.0,"",0);
	}
	public Bookapp(String isbn, double price, String authorName, int qty) {
		
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Bookapp other = (Bookapp) obj;
		if(other.getIsbn().equals(this.isbn))
			return true;
		return false;
	}
	public int hashCode() {
		int hash=Objects.hash(this.isbn);
		return hash;
	}
	}

