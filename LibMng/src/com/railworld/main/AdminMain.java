package com.railworld.main;

import java.util.List;
import java.util.Scanner;

import com.railworld.dao.*;
import com.railworld.model.Books;
import com.railworld.model.Librarian;
import com.railworld.model.Member;
import com.railworld.model.issue;

public class AdminMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static AdminDaoImp adminDaoImp;
	private static LibrarianDaoImp ldi;
	private static MemberDaoImp mdi ;
	private static BooksDaoImp bdi ;
	
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
		
		for(Librarian librarian1: librarian) {
			System.out.println(librarian);
		}
		
	}
	
	private static void viewAllMembers() {
		
		List<Member> members = mdi.Memdata();
		
		System.out.println("Members List");
		
		for(Member members1: members) {
			System.out.println(members1);
		}
	}
		
	private static void viewAllBookRecords() {
			
			List<Books> bookRecords = bookRecords.getAllBookRecords();
			
			System.out.println("Book Record List");
			
			for(Books bookRecords1: bookRecords) {
				System.out.println(bookRecords);
			}
	}
	
	private static void viewAllIssueRecords() {
		
		List<issue> issueRecords = bdi.getIssue();
		
		System.out.println("Book Record List");
		
		for(issue issueRecords1: issueRecords) {
			System.out.println(issueRecords);
		}
	}
	
	
	private static void addLibrarian() {
		
		System.out.print("Enter Librarian name:");
		String name = sc.nextLine();
		System.out.print("Enter Workdays(e.g., 12345 for someone working all five workdays):");
		int workDays = sc.nextInt();
		System.out.println("Enter id to be assigned");
		int compId= sc.nextInt();
		Librarian librarian = new Librarian();
		librarian.setLibrarianName(name);
		librarian.setWorkDays(workDays);
		librarian.setCompanyId(compId);
		librarianService.addLibrarian(librarian);
		System.out.println("Updated successfully!");
	}
}
	