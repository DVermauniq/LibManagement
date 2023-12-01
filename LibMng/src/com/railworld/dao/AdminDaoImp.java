package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public boolean Login(String nm, String pw) throws SQLException {
		String query ="Select * From Admin Where name = ?, and password = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, nm);
				preparedStatement.setString(1, pw);
			try (ResultSet resultSet = preparedStatement.executeQuery()){
				return resultSet.next();
			}
		}
	}
}
	
	
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AdminDAO {
//    private Connection connection;
//
//    // Constructor to initialize the database connection
//    public AdminDAO(Connection connection) {
//        this.connection = connection;
//    }
//
//    // Method to add a new admin to the database
//    public void addAdmin(Admin admin) throws SQLException {
//        String query = "INSERT INTO admins (username, password) VALUES (?, ?)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//            preparedStatement.setString(1, admin.getUsername());
//            preparedStatement.setString(2, admin.getPassword());
//            preparedStatement.executeUpdate();
//        }
//    }
//
//    // Method to retrieve a specific admin by ID
//    public Admin getAdminById(int adminId) throws SQLException {
//        String query = "SELECT * FROM admins WHERE id = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//            preparedStatement.setInt(1, adminId);
//            try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                if (resultSet.next()) {
//                    String username = resultSet.getString("username");
//                    String password = resultSet.getString("password");
//                    return new Admin(adminId, username, password);
//                }
//            }
//        }
//        return null; // Return null if no admin found with the given ID
//    }
//
//    // Method to retrieve all admins from the database
//    public List<Admin> getAllAdmins() throws SQLException {
//        List<Admin> admins = new ArrayList<>();
//        String query = "SELECT * FROM admins";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
//             ResultSet resultSet = preparedStatement.executeQuery()) {
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String username = resultSet.getString("username");
//                String password = resultSet.getString("password");
//                admins.add(new Admin(id, username, password));
//            }
//        }
//        return admins;
//    }
//
//    // Method to update an existing admin in the database
//    public void updateAdmin(Admin admin) throws SQLException {
//        String query = "UPDATE admins SET username = ?, password = ? WHERE id = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//            preparedStatement.setString(1, admin.getUsername());
//            preparedStatement.setString(2, admin.getPassword());
//            preparedStatement.setInt(3, admin.getId());
//            preparedStatement.executeUpdate();
//        }
//    }
//
//    // Method to delete an admin from the database
//    public void deleteAdmin(int adminId) throws SQLException {
//        String query = "DELETE FROM admins WHERE id = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//            preparedStatement.setInt(1, adminId);
//            preparedStatement.executeUpdate();
//        }
//    }
//}