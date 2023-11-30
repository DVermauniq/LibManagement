package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.railworld.connection.JDBC;
import com.railworld.model.*;

public class AdminDaoImp {
	
	private Connection connection;
	public AdminDaoImp() {
		try {
			connection = JDBC.getConnection();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean Login(String nm, String pw) {
		try {
			String query ="Select name, password from Admin Where aId = ?";
			try (PreparedStatement s1 = connection.prepareStatement(query)){
				s1.nm = ;
			}
		}
		
	}

}
