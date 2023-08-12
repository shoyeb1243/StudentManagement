package com.studentmanagementappliction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
public class Connection1
{
	static Connection connection =null;
	public static Connection createC()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String username="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/students";
			connection=DriverManager.getConnection(url, username, password);	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return connection;
	}
}
