package Assignment2;
import java.util.Scanner;
 class Invoice{
String partnumber;
String partdescription;
int quant;
double price;
double amount;

public Invoice(){
	this("xxxx","xxx",0,0);
}
public Invoice(String partnumber,String partdescription,int quant,double price){
this.partnumber=partnumber;
this.partdescription=partdescription;
this.quant=quant;
this.price=price;
	}
public String get_Partno() {
return this.partnumber;

}
public String get_PartDescription() {
return this.partdescription;
}
public int get_Quant() {
return this.quant;

}
public double get_Price() {
return this.price;

}
public void set_Partno(String partnumber) {
this.partnumber=partnumber;
}
public void set_Partdescription(String partdescription) {
this.partdescription=partdescription;
}
public void set_Quant(int quant) {
this.quant=quant;
}
public void set_Price(double price) {
this.price=price;
}
public double invoice_amount() {
	if(quant<0 && price<0) {
		quant=0;
		price=0.0;
		return amount;
	}
	else {
	 amount=quant*price;
	 return this.amount;
	}
}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("THE Partnumber: ");
	partnumber=sc.next();
	System.out.println("The Partdescription: ");
	partdescription=sc.next();
	System.out.println("The Quantity: ");
	quant=sc.nextInt();
	System.out.println("The Price: ");
	price=sc.nextDouble();
	}
public void display() {
	System.out.println("The Partnumber: "+partnumber);
	System.out.println("The Partdescription: "+partdescription);
	System.out.println("The Quantity: " +quant);
	System.out.println("The Price per Item: "+price);
}
};
public class Test{
	public static void main(String[] args) {
		Invoice I1= new Invoice();
		I1.accept();
		I1.display();
		double result=I1.invoice_amount();
		System.out.println("the amount = "+result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}