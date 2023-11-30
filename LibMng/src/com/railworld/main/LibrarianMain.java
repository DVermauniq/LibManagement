package com.railworld.main;

import java.util.List;
import java.util.Scanner;

import com.railworld.dao.BooksDaoImp;

import com.railworld.dao.MemberDaoImp;
import com.railworld.model.Books;
import com.railworld.model.Member;
import com.railworld.model.issue;

public class LibrarianMain {

	private static Scanner sc = new Scanner(System.in);
	
	private static MemberDaoImp mdi;
	private static BooksDaoImp bdi;

	public static void main(String[] args) {

		while (true) {

			System.out.println("2. Add new Member");
			System.out.println("3. Add new Book");
			System.out.println("4. View all Members Registered");
			System.err.println("5. View all Books Registered");
			System.out.println("6. View Issue Request");
			System.out.println("7. Update a Member Record");
			System.out.println("10. Exit");
			System.out.println("Enter your choice:");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
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
			case 10:
				System.out.println("Exiting the progrram");
				System.exit(0);
			default:
				System.out.println("Invalid choice. please try again.");
			}
		}
	}

	private static void updateMember() {
		System.out.print("Enter id to update:");
		int id=sc.nextInt();
		
		System.out.print("Enter new name:");
		Long Contact = sc.nextLong();
		

		Member meme= new Member();
		meme.setContact(Contact);
		meme.setmId(id);
		mdi.updateMem(meme);

		System.out.println("Updated successfully!");
		// TODO Auto-generated method stub

	}

	private static void viewAllIssueRequest() {
		List<issue> bk;
		bk = bdi.getIssue();

		System.out.println("Member List:");
		for (issue m : bk) {
			System.out.println(m);
		}
		// TODO Auto-generated method stub

	}

	private static void viewAllBooks() {
		List<Books> bk;
		bk = bdi.getBook();

		System.out.println("Member List:");
		for (Books m : bk) {
			System.out.println(m);
		}
		// TODO Auto-generated method stub

	}

	private static void viewAllMembers() {
		List<Member> mem;
		mem = mdi.Memdata();

		System.out.println("Member List:");
		for (Member m : mem) {
			System.out.println(m);
		}
		// TODO Auto-generated method stub

	}

	private static void addBook() {
		// TODO Auto-generated method stub
		System.out.print("Enter book name:");
		String name = sc.nextLine();

		System.out.println("Enter author");
		String author = sc.nextLine();
		System.out.println("Enter book id");
		int bId = sc.nextInt();
		Books bk = new Books();
		bk.setName(name);
		bk.setAuthor(author);
		bk.setbId(bId);
		bdi.addBook(bk);
		System.out.println("Updated successfully!");
	}

	private static void addMember() {
		System.out.print("Enter member name:");
		String name = sc.nextLine();

		System.out.println("Enter contact");
		Long contact = sc.nextLong();
		System.out.println("Enter member id");
		int mId = sc.nextInt();
		Member m1 = new Member();
		m1.setName(name);
		m1.setContact(contact);
		m1.setmId(mId);
		mdi.addMembers(m1);
		System.out.println("Updated successfully!");
		// TODO Auto-generated method stub

	}

}
