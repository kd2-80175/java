package com.solution1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] arr=new Emp[3];
		arr[0]=new Manager(50000,3000);
		arr[1]=new Labour(2.5,5.5);
		arr[2]=new Clerk(4000);
		double totalIncome=Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);

	}

}
