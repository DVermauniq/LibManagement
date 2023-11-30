package com.railworld.connection;

import java.sql.*;
import java.sql.DriverManager;

public class JDBC {
	private static String url = "jdbc:mysql://localhost:3306/libManage";
    private static String username = "root";
    private static String password = "root";
    private static Connection con;


    public static Connection getConnection(){
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
