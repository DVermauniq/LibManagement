package com.railworld.main;

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
	
	private static void updateBookStatus() {
		// TODO Auto-generated method stub
		
	}

	private static void viewAllBalanceRecords() {
		// TODO Auto-generated method stub
		
	}

	private static void viewAllIssueRecords() {
		// TODO Auto-generated method stub
		
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
		
		 List<Book> book;
			book = BooksDaoImp.Bookdata();

		
		System.out.println("Member List:");
		for (Member m : member) {
			System.out.println(m);
		}
	}
}
