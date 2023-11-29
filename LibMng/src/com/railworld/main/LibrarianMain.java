package com.railworld.main;

import java.util.List;
import java.util.Scanner;

import com.railworld.dao.*;

public class LibrarianMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static LibrarianDaoImp librarianDaoImp;
	
	public static void main(String[] args) {
		LibrarianDaoImp librarianDaoImp = new LibrarianDaoImp();
		
		while(true) {
			System.out.println("1. View Personal Information");
			System.out.println("2. Add new Member");
			System.out.println("3. Add new Book");
			System.out.println("4. View all Members Registered");
			System.err.println("5. View all Books Registered");
			System.out.println("6. View Issue Request");
			System.out.println("7. Update a Member Record");
			System.out.println("8. View personal IssueRecords");
			System.out.println("9. View personal BalanceRecords");
			System.out.println("10. Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				viewAllLibrarian();
				break;
			case 2:
				addMember();
				break;
			case 3:
				addBook();
				break;
			case 4:
				viewAllMembers();
				break;				
			case 5:
				viewAllBooks();
				break;				
			case 6:
				viewAllIssueRequest();
				break;
			case 7:
				updateMember();
				break;				
			case 8:
				viewAllIssueRecords();
				break;				
			case 9:
				viewAllBalanceRecords();
				break;			
			case 10:
				System.out.println("Exiting the progrram");
				System.exit(0);				
				default:
					System.out.println("Invalid choice. please try again.");
			}
		}
	}
}
