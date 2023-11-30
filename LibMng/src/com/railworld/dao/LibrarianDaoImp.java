package com.railworld.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.railworld.connection.JDBC;
import com.railworld.model.Librarian;
public class LibrarianDaoImp{
private Connection connection;
	
	public LibrarianDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addLibrarian(Librarian Lib) {
		try {
			String query="INSERT INTO Librarian(Name,lId,workdays) VALUES(?, ?, ?)";
			try(PreparedStatement stmt=connection.prepareStatement(query)){
				
				stmt.setString(1,Lib.getName());
				stmt.setInt(2, Lib.getlId());
				stmt.setInt(3, Lib.getWorkdays());
				stmt.executeUpdate();
				
			}
		}catch(Exception e)
			{
		
				e.printStackTrace();
			}		    
		
	}
	public List<Librarian> getlib(){
		String query="SELECT * from librarian";
		List<Librarian> e1 = new ArrayList<>();
		try(PreparedStatement statement=connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Librarian lib1 = new Librarian(resultSet.getInt("lId"), resultSet.getString("name"), resultSet.getInt("workdays"));
				e1.add(lib1);
			}
		}
				
		catch(Exception e)	{
			e.printStackTrace();
		}
		return e1;
		
	}
	public void updateLib(Librarian Librarian) {
		try {
			String query = "UPDATE Librarian SET WorkDays = ? WHERE lId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.setLong(1, Librarian.getWorkdays());
				s1.setInt(2, Librarian.getlId());
				s1.executeUpdate();
				
				System.out.println("UPdateLibrarianRecord..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	public void deleteLib(int lId) {
		try {
			String query ="Delete from Librarian where lId=?";
			String q= "UPDATE issued SET isId= null WHERE lId="+lId;
			PreparedStatement s2= connection.prepareStatement(q);
			try (PreparedStatement stmt=connection.prepareStatement(query)){
				s2.setInt(1, lId);
				s2.executeUpdate();
				s2.executeUpdate();
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	

}
