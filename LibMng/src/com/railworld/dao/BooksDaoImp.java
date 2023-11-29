package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.railworld.connection.JDBC;
import com.railworld.model.Books;
public class BooksDaoImp {
	
	private Connection connection;
	public BooksDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void createIssue() {
		try(Connection connection=JDBC.getConnection();
				Statement s1=connection.createStatement();)
		    {
			String query = "CREATE TABLE Guard"+"(gId int auto_increament,"+ "guardName varchar(255),"+"status varchar(255),"+"companyId int"+"Primary key(gId)"+"FOREIGN KEY(companyId) REFERENCES Company(companyId))";
			s1.executeUpdate(query);
			System.out.println("Table Created");
			
		}
		    catch(Exception e)
		    {
		    	e.printStackTrace();}
		
	}
	
	public void updateIssue(Books iss) {
		try {
			String query = "UPDATE Company SET Name = ? WHERE companyId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.setString(1, iss.getName());
				s1.setInt(2, iss.getbId());
				s1.executeUpdate();
				
				System.out.println("UPdateCompanyName..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	public void addBalance() {
		try(Connection connection=JDBC.getConnection();
				Statement s1=connection.createStatement();)
		    {
			String query = "CREATE TABLE Guard"+"(gId int auto_increament,"+ "guardName varchar(255),"+"status varchar(255),"+"companyId int"+"Primary key(gId)"+"FOREIGN KEY(companyId) REFERENCES Company(companyId))";
			s1.executeUpdate(query);
			System.out.println("Table Created");
			
		}
		    catch(Exception e)
		    {
		    	e.printStackTrace();}
		
	}
	
	public List<Books> getBook(){
		
	}
	
	
}
