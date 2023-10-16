package com.sunbeam;




class Box<T>{
	private T obj;
	public Box(T obj) {
	this.obj = obj;
	}
	public Box() {
		super();
		}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public static void printdisplayable(Box<? extends Displayable>b) {
		b.getObj().display();
		
	}
	public static void printanybox(Box<?> t) {
		System.out.println(t.getObj().toString());
	}
}
public class Tester {
	public static void main(String[] args) {
		Box<Person> b2=new Box<>();
		b2.setObj(new Person());
		b2.getObj().accept();
		b2.printdisplayable(b2);
		b2.printanybox(b2);
		
		Box<Date> b1=new Box<>();
b1.setObj(new Date());
b1.getObj().accept();
b1.printdisplayable(b1);
b1.printanybox(b1);
Box<String> s=new Box<>();
s.setObj("Prerna");

}
}
