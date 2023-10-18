package com.employeeapp;
import java.util.*;
import java.util.Collection;

public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Employee> list=new LinkedList();
		int choice;
		do {
			System.out.println("**********M E N U*********");
			System.out.println("0. EXIT");
			System.out.println("1. Add");
			System.out.println("2. DELETE");
			System.out.println("3. FIND");
			System.out.println("4. SORT");
			System.out.println("5. EDIT");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			System.out.println("***************************");
			switch(choice) {
			case 1: Employee e=new Employee();
					e.accept();
			        list.addLast(e);
			        break;
			case 2: list.removeFirst();   
			    break;
			    
			case 3: {System.out.println("enter empid: ");
			        int empid=sc.nextInt();
			        Employee key=new Employee();
			        key.setEmpid(empid);
			        int index=list.indexOf(key);
			        if(index==-1)
			        	System.out.println("Employee not found");
			        else {
			        	System.out.println("employee found at index: "+index);
			        	e=list.get(index);
			        	System.out.println(e);
			        }
			        }
			        break;
			case 4:{class EmpComparator implements Comparator<Employee>{

				@Override
				public int compare(Employee e1, Employee e2) {
					int diff=e1.getEmpid()-e2.getEmpid();
					return diff;
				}
				     
			         }
			EmpComparator c=new EmpComparator();
				   list.sort(c);
				   for(Employee e1:list)
					   System.out.println(e1);
			}
			break;
			case 5:{System.out.println("Enter emp id to be modified: ");
			       int id = sc.nextInt();
			       Employee key = new Employee();
			       key.setEmpid(id);
			       int index = list.indexOf(key);
			       if(index == -1)
			       System.out.println("Employee not found.");
			       else {
			       Employee oldEmp = list.get(index);
			       System.out.println("Employee Found: " + oldEmp);
			       System.out.println("Enter new information for the Employee");
			       Employee newEmp = new Employee();
			       newEmp.accept();
			       list.set(index, newEmp);
			       }}
			break;
			       
		}
			}while(choice!=0);
		}
		}


