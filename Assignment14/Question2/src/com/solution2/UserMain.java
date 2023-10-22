package com.solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user = new User();
		int choice;
		do {
			System.out.println("*************M E N U**************");
			System.out.println("1. ADD");
			System.out.println("2. DISPLAY");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("0. EXIT");
			System.out.print("ENTER CHOICE: ");
			choice=sc.nextInt();
			System.out.println("**********************************");
			
			switch(choice) {
			case 1: {
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter last name");
					String lname = sc.next();
					System.out.println("Enter Email");
					String email = sc.next();
					System.out.println("Enter Password");
					String passwd = sc.next();
					System.out.println("Enter BirthDate");
					String dob = sc.next();
					user.setFirst_name(fname);
					user.setLast_name(lname);
					user.setEmail(email);
					user.setPassword(passwd);
					user.setDob(dob);
					int cnt = dao.insertUser(user);
					System.out.println("User Added :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
				break;
			case 2:
			{
				// displayALl
				try (UserDao dao = new UserDao()) {
					List<User> list = new ArrayList<>();
					list = dao.displayAll();
					list.forEach(e -> System.out.println(e));
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
				break;
			case 3: 
			{
				// update
				try (UserDao dao = new UserDao()) {

					System.out.println("Enter Id to be updated");
					int id = sc.nextInt();
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter last name");
					String lname = sc.next();
					System.out.println("Enter Password");
					String passwd = sc.next();

					user.setFirst_name(fname);
					user.setLast_name(lname);
					user.setPassword(passwd);
					user.setId(id);
					int cnt = dao.updateUser(user);
					System.out.println("User Updated :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 4: {//delete
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter ID to be Deleted");
					int id = sc.nextInt();
					user.setId(id);
					int cnt = dao.deleteUser(user);
					System.out.println("User Deleted :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			break;
			}
		
		}while(choice!=0);
		

	}

}
