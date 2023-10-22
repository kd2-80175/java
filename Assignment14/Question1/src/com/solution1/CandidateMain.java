package com.solution1;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CandidateMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("***************MENU***************");
			System.out.println("0.EXIT");
			System.out.println("1.ADD NEW CANDIDATE");
		    System.out.println("2.MODIFY NAME & PARTY FOR ID");
		    System.out.println("3.GET PARTYWISE TOTAL VOTES");
		    System.out.print("ENTER YOUR CHOICE: ");
		    choice=sc.nextInt();
		    System.out.println("*********************************");
		    switch(choice) {
		    case 1: {
		    	System.out.println("********NEW CANDIDATE DETAIL*********");
		    	try(CandidateDao dao=new CandidateDao()){
			System.out.println("Enter name: ");
			String name=sc.next();
			System.out.println("Enter party: ");
			String party=sc.next();
			System.out.println("Enter votes");
			int votes=sc.nextInt();
			Candidate c=new Candidate(0,name,party,votes);
			int cnt=dao.save(c);
			System.out.println("Inserted Row= "+cnt);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		    }
		    break;
		    case 2:{
		    	System.out.println("**********UPDATION DETAIL***********");
		     try(CandidateDao dao=new CandidateDao()){
			System.out.print("Enter Id for updation: ");	
			int candidateId=sc.nextInt();
			System.out.println("Enter new name: ");
			String name = sc.next();
			System.out.println("Enter new party: ");
			String party = sc.next();
			Candidate c = new Candidate(candidateId, name, party, 0);
			dao.update(c);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		    }
		    break;
		    case 3:{
		    	try(CandidateDao dao=new CandidateDao()){
		    		
		    		List<PartyVotes> list=dao.getPartywiseVotes();
		    		list.forEach(c->System.out.println(c));
		    	}
		    	catch(SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
		    break;
		    	
		    }
	}while(choice!=0);
	}
}
