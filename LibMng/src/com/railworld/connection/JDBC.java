package com.railworld.connection;

import java.sql.*;

public class JDBC {
	private static Connection con;
	private static final String url = "jdbc:mysql://localhost:3306/libManage";
	private static final String username = "root";
	private static final String password = "root";
	public static Connection getConnection() {
		try {
		if(con==null) {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection(url, username, password);
				
			} 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	

}
