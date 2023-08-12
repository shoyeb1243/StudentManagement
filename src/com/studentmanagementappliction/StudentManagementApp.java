package com.studentmanagementappliction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class StudentManagementApp {
	public static void main(String[] args) throws Exception {
System.out.println("Wellcome to ...");
BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
while (true) {
	System.out.println("1.Press to Adding");
	int c=Integer.parseInt(bReader.readLine());
	if (c==1) 
	{
		System.out.println("Enter Username");
		String name=bReader.readLine();
		System.out.println("Enter Number");
		String number=bReader.readLine();
		Student student=new Student(name,number);
		boolean answer=StudentDao.insert(student);
		if (answer) {
			System.out.println("Wow");
		}
		else
		{
			System.out.println("Something is rong");
		}
		System.out.println(student);
	}
	else {
		
	}
System.out.println("Thank You For Useing My Appliction...");
}
	}
}
