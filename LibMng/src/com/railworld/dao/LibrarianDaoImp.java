package com.railworld.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
	
	public void createLibrarian(Librarian Lib) {
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
	public List<Librarian> getLib(){
		String query="SELECT * from Guard";
		List<Librarian> e1 = new ArrayList<>();
		try(PreparedStatement statement=connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Librarian lib1 = new Librarian(resultSet.getInt("lId"), resultSet.getString("name"), resultSet.getInt("workdays"));
				e1.add(lib1);
			}
		}
				
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return e1;
		
	}
	public void updateLib(Librarian Librarian) {
		try {
			String query = "UPDATE Company SET Name = ? WHERE companyId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.setString(1, Librarian.getName());
				s1.setInt(2, Librarian.getlId());
				s1.executeUpdate();
				
				System.out.println("UPdateCompanyName..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	public void deleteLib(int lId) {
		try {
			String query ="Delete from Guard where lId=?";
			String q= "UPDATE Res SET lId= null WHERE lId="+lId;
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
