package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {

	private static Scanner scanner = new Scanner(System.in);
	
	private final String userName = "root";
	private final String userPassword = "root";
	private final String url = "jdbc:mysql://localhost:3306/java";	
	
	private static Connection connection;
	
	public JDBC() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url,userName,userPassword);
	}
	private static boolean insertData() throws SQLException {
		String q = "insert into oops values(?,?)";
		PreparedStatement psmt =  connection.prepareStatement(q);
		System.out.println("Enter your id ");
		psmt.setInt(1,scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter your name ");
		psmt.setString(2,scanner.nextLine());
		int row = psmt.executeUpdate();
		if(row > 0) 
			return true;
		return false;
	}
	public static void main(String[] args) {
		try {
		new JDBC();
		if(insertData()) {
			System.out.println("YOur data has entered Successfully");
		}
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}	
	}
}
