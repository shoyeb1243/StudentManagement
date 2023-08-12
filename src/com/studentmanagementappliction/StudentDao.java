package com.studentmanagementappliction;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class StudentDao
{
public static boolean insert(Object s)
{  
	boolean f=false;
	  if(s instanceof Student)
	  {
		    Student st=(Student)s;
	try
	{
		Connection connection=Connection1.createC();
		String qString="insert into stu(name,number) values(?,?)";
		PreparedStatement statement=connection.prepareStatement(qString);
		statement.setString(1, st.getStudentName());
		statement.setString(2, st.getStudentNumber());
		statement.execute();
		f=true;
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}	
}
	return f;
}
}

