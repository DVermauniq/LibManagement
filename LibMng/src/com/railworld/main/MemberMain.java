package com.railworld.main;
// Two major prob - viewAllBalanceRecords - related to balance table 
// & updateBookStatus - prob with method in daoclass
import java.util.List;
import java.util.Scanner;

import com.railworld.dao.*;
import com.railworld.model.*;

public class MemberMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static MemberDaoImp memberDaoImp;
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("1. View Personal Information");
			System.out.println("2. View Book Details");
			System.out.println("3. View personal IssueRecords");
			System.out.println("4. View personal BalanceRecords");
			System.out.println("5. Request for Book Issue");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				viewAllMembers();
				break;
			case 2:
				viewAllBook();
				break;		
			case 3:
				viewAllIssueRecords();
				break;				
			case 4:
				viewAllBalanceRecords();
				break;
			case 5:

				updateBookStatus();

				break;
			case 6:
				System.out.println("Exiting the progrram");
				System.exit(0);				
				default:
					System.out.println("Invalid choice. please try again.");
			}
		}
	}
	

	
	private static void viewAllMembers(){
		
		 List<Member> member;
			member = memberDaoImp.Memdata();

		
		System.out.println("Member List:");
		for (Member m : member) {
			System.out.println(m);
		}
	}
	
	private static void viewAllBook(){
		
		 List<Books> book;
			book = BooksDaoImp.getBook();

		
		System.out.println("Member List:");
		for (Books b : book) {
			System.out.println(b);
		}
	}
	
	private static void viewAllIssueRecords() {
		
		List<issue> issueRecords = BooksDaoImp.getIssue();
		
		System.out.println("Book Record List");
		
		for(issue issueRecords1: issueRecords) {
			System.out.println(issueRecords1);
		}
	}
	
//	private static void viewAllBalanceRecords() {
//		
//		List<BalanceRecords> balanceRecords = balanceRecords.getAllBalanceRecords();
//		
//		System.out.println("Book Record List");
//		
//		for(BalanceRecords balanceRecords1: balanceRecords) {
//			System.out.println(balanceRecords);
//		}
//	}
	
	private static void updateBookStatus() {
		
		System.out.print("Enter issue Id");
		int isId = sc.nextInt();
		System.out.print("Enter issue Date:");
		String isDate = sc.nextLine();
		System.out.print("Enter expected submission Date:");
		String subDate = sc.nextLine();
		System.out.print("Enter book Id");
		int bId = sc.nextInt();
		System.out.println("Enter member Id");
		int mId= sc.nextInt();
		System.out.println("Enter librarian Id");
		int lId= sc.nextInt();
		
		BooksDaoImp bdi = new BooksDaoImp();
		issue is1 = new issue();
		bdi.addIssue(isId, isDate, subDate, bId, mId, lId);
		System.out.println("Updated successfully!");
	}
}
