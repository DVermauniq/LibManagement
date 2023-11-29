package com.railworld.main;

import java.util.List;
import java.util.Scanner;

import com.railworld.dao.*;

public class AdminMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static AdminDaoImp adminDaoImp;
	
	public static void main(String[] args) {
		AdminDaoImp adminDaoImp = new AdminDaoImp();
		
		while(true) {
			System.out.println("1. View all Librarian");
			System.out.println("2. Add new Librarian");
			System.out.println("3. View all Members");
			System.err.println("4. View all BookRecords");
			System.out.println("5. View all IssueRecords");
			System.out.println("6. View all BalanceRecords");
			System.out.println("7. Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				viewAllLibrarian();
				break;
			
			case 2:
				addLibrarian();
				break;
			case 3:
				viewAllMembers();
				break;
				
			case 4:
				viewAllBookRecords();
				break;
				
			case 5:
				viewAllIssueRecords();
				break;
				
			case 6:
				viewAllBalanceRecords();
				break;
			
			case 7:
				System.out.println("Exiting the progrram");
				System.exit(0);
				
				default:
					System.out.println("Invalid choice. please try again.");
			}
		}
	}
	
	private static void viewAllLibrarian() {
		
		List<Librarian> librarian = librarian.getAllLibrarian();
		
		System.out.println("Librarian List");
		
		for(librarian librarian1: librarian) {
			System.out.println(librarian);
		}
		
	}
	
	private static void viewAllMembers() {
		
		List<Members> members = members.getAllMembers();
		
		System.out.println("Members List");
		
		for(Members members1: members) {
			System.out.println(members);
		}
		
	private static void viewAllBookRecords() {
			
			List<BookRecords> bookRecords = bookRecords.getAllBookRecords();
			
			System.out.println("Book Record List");
			
			for(BookRecords bookRecords1: bookRecords) {
				System.out.println(members);
			}

		
	}
}
