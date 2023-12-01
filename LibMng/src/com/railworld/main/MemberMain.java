package com.railworld.main;

import java.util.List;
import java.util.Scanner;

import com.railworld.dao.BooksDaoImp;
import com.railworld.dao.MemberDaoImp;
import com.railworld.model.Books;
import com.railworld.model.Librarian;
import com.railworld.model.Member;
import com.railworld.model.issue;

public class MemberMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static MemberDaoImp memberDaoImp;
	private static BooksDaoImp bdi;	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("1. View Personal Information");
			System.out.println("2. View Book Details");
			System.out.println("3. View personal IssueRecords");
			System.out.println("4. Request for Book Issue");
			System.out.println("5. Exit");
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
			book = bdi.getBook();

		
		System.out.println("Member List:");
		for (Books b : book) {
			System.out.println(b);
		}
	}
	
	private static void viewAllIssueRecords() {
		
		List<issue> issueRecords = bdi.getIssue();
		
		System.out.println("Book Record List");
		
		for(issue issueRecords1: issueRecords) {
			System.out.println(issueRecords1);
		}
	}

	private static void updateBookStatus() {
		
		System.out.print("Enter issue Id");
		int isId = sc.nextInt();
		System.out.print("Enter issue Date:");
		String isDate = sc.nextLine();
		System.out.print("Enter expected submission Date:");
		String subDate = sc.nextLine();
		
		issue iup = new issue();
		iup.setIsId(isId);
		iup.setIsDate(isDate);
		iup.setSubDate(subDate);
		
		System.out.print("Enter book Id");
		int bId = sc.nextInt();
		Books bup = new Books();
		bup.setbId(bId);
		
		System.out.println("Enter member Id");
		int mId= sc.nextInt();
		Member meme= new Member();
		meme.setmId(mId);
		
		System.out.println("Enter librarian Id");
		int lId= sc.nextInt();
		Librarian lup = new Librarian();
		lup.setlId(lId);
		
		BooksDaoImp bdi = new BooksDaoImp();
		bdi.addIssue(iup , bup, lup, meme);
		System.out.println("Updated successfully!");
	}
}
