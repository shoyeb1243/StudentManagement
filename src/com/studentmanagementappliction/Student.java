package com.studentmanagementappliction;
public class Student
{
private String studentName;
private String studentNumber;
public String getStudentName() 
{
	return studentName;
}
public void setStudentName(String studentName) 
{
	this.studentName = studentName;
}
public String getStudentNumber()
{
	return studentNumber;
}
public void setStudentNumber(String studentNumber) 
{
	this.studentNumber = studentNumber;
}
public Student(int studentId, String studentName, String studentNumber)
{
	super();
	this.studentName = studentName;
	this.studentNumber = studentNumber;
}
public Student(String studentName, String studentNumber) 
{
	super();
	this.studentName = studentName;
	this.studentNumber = studentNumber;
}
public Student() 
{
	super();
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentNumber=" + studentNumber
			+ "]";
}
}