package Assignment2;
import java.util.Scanner;
class Date{
	int month;
	int day;
	int year;
	public Date() {
		this.month=0;
		this.day=0;
		this.year=0;
	}
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
public void display_Date() {
	System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
}
};
public class DateTest {
public static void main(String[] args) {
	Date D1=new Date();
	D1.setDay(7);
	D1.setMonth(10);
	D1.setYear(2023);
	D1.display_Date();
	
}
}
