package com.railworld.service;

import java.util.List;

import com.railworld.dao.BooksDaoImp;
import com.railworld.model.Books;
import com.railworld.model.Librarian;
import com.railworld.model.Member;
import com.railworld.model.issue;

public class BooksService {
	private BooksDaoImp bdi;
	public BooksService(BooksDaoImp bdi) 
	{
		this.bdi=bdi;
		
	}
	public  List<Books> getBook()
	{
		return bdi.getBook();
		
	}
	public void addbook(Books book)
	{
		bdi.addBook(book);
		
	}
	public void addIssue(issue iss,Books book, Librarian Lib,Member mem) {
		bdi.addIssue(iss, book, Lib, mem);
		
	}
	public List<issue> getIssue(){
		return bdi.getIssue();
	}
	public void updateIssue(issue iss,Books book, Librarian Lib,Member mem) {
		bdi.updateIssue(iss, book, Lib, mem);
		
	}

}
