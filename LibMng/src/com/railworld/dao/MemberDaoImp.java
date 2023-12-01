package com.railworld.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.railworld.connection.JDBC;

import com.railworld.model.Member;
public class MemberDaoImp{
	private Connection connection;
	public MemberDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public void addMembers(Member mem) {
		try {
			String query="INSERT INTO Members(name,contact,mId) VALUES(?, ?, ?)";
			try(PreparedStatement stmt=connection.prepareStatement(query)){
				
				stmt.setInt(1, mem.getmId());
				stmt.setString(2,mem.getName());
				stmt.setLong(3, mem.getContact());
				stmt.executeUpdate();
				
			}
		}catch(Exception e)
			{
		
				e.printStackTrace();
			}

			
		
	}

	public List<Member> Memdata(){
		String query="SELECT * from Members";
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
			String query ="Delete from Members where lId=?";
			String q= "UPDATE issued SET isId= null WHERE mId="+mId;
			
			PreparedStatement s2= connection.prepareStatement(q);
			try (PreparedStatement stmt=connection.prepareStatement(query)){
				stmt.setInt(1, mId);
				stmt.executeUpdate();
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
			String query = "UPDATE Member SET Contact = ? WHERE mId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.setLong(1, mem.getContact());
				s1.setInt(2, mem.getmId());
				s1.executeUpdate();
				
				System.out.println("UPdateMemberRecord..........");
				
//				stmt.close();
				
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
