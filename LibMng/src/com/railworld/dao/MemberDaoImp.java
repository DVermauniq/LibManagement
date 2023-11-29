package com.railworld.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.railworld.connection.JDBC;

import com.railworld.model.Member;
public class MemberDaoImp extends AdminDaoImp{
	private Connection connection;
	public MemberDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createMembers(Member mem) {
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

	public List<Member> Memdata(){
		String query="SELECT * from Guard";
		List<Member> m1 = new ArrayList<>();
		try(PreparedStatement statement=connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				Member mem1 = new Member(resultSet.getInt("mId"), resultSet.getString("name"), resultSet.getLong("contact"));
				m1.add(mem1);
			}
		}
				
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return m1;
		
	}
	
	public void deleteMem(int mId) {
		try {
			String query ="Delete from Guard where lId=?";
			String q= "UPDATE Res SET lId= null WHERE lId="+mId;
			PreparedStatement s2= connection.prepareStatement(q);
			try (PreparedStatement stmt=connection.prepareStatement(query)){
				s2.setInt(1, mId);
				s2.executeUpdate();
				s2.executeUpdate();
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
	public void updateMem(Member mem) {
		try {
			String query = "UPDATE Company SET Name = ? WHERE companyId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.setString(1, mem.getName());
				s1.setInt(2, mem.getmId());
				s1.executeUpdate();
				
				System.out.println("UPdateCompanyName..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
