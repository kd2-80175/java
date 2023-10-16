package com.assignment8;
 class Box<T extends Employee> {
	private T obj;
 public T getobj(){
	 return obj;
 }
 public void setobj(T obj){
	 this.obj=obj;
 }
 public double getsal() {
	 return obj.getSalary();
 }
 


}
public class Demo1{
	public static void main(String[] args) {
		Box<Sales> b1=new Box<>();
		b1.setobj(new Sales());
		b1.getobj().accept();
		b1.getobj().calculateTotalearning();
		
		
		
	}
}