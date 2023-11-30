package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.railworld.connection.JDBC;
import com.railworld.model.Books;
import com.railworld.model.Librarian;
import com.railworld.model.Member;
import com.railworld.model.issue;

public class BooksDaoImp {
	
	private Connection connection;
	public BooksDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void addIssue(issue iss,Books book,Librarian lib,Member mem) {
		try {
			String query="INSERT INTO Guard(guardName,status,companyId) VALUES(?, ?, ?)";
			try(PreparedStatement stmt=connection.prepareStatement(query)){
				stmt.setInt(1,iss.getIsId());
				stmt.setString(2, iss.getIsDate());
				stmt.setString(3, iss.getSubDate());
				stmt.setInt(4,mem.getmId());
				stmt.setInt(5,book.getbId());
				stmt.setInt(6,lib.getlId());
				stmt.executeUpdate();
				
			}
		}catch(Exception e)
			{
		
				e.printStackTrace();
			}
		
	}
	
	public void updateIssue(issue iss,Books book,Librarian lib,Member mem) {
		try {
			String query = "UPDATE Company SET Name = ? WHERE companyId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				
				s1.setInt(1,iss.getIsId());
				s1.setString(2, iss.getIsDate());
				s1.setString(3, iss.getSubDate());
				s1.setInt(4,mem.getmId());
				s1.setInt(5,book.getbId());
				s1.setInt(6,lib.getlId());
				s1.executeUpdate();
				
				System.out.println("UPdateCompanyName..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	
	public List<Books> getBook(){
		String query="SELECT * from Guard";
		List<Books> b1 = new ArrayList<>();
		try(PreparedStatement statement=connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Books mem1 = new Books(resultSet.getInt("bId"), resultSet.getString("name"), resultSet.getString("author"),resultSet.getInt("copies"));
				b1.add(mem1);
			}
		}
				
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b1;
		
	}
	public void addBook(Books book) {
		try {
			String query="INSERT INTO Guard(guardName,status,companyId) VALUES(?, ?, ?)";
			try(PreparedStatement stmt=connection.prepareStatement(query)){
				
				stmt.setInt(1, book.getbId());
				stmt.setString(2,book.getName());
				stmt.setString(3, book.getAuthor());
				stmt.setInt(4, book.getCopies());
				stmt.executeUpdate();
				
			}
		}catch(Exception e)
			{
		
				e.printStackTrace();
			}
		
	}

	
	
}
