package com.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ece {

	
	void details() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Rollno:");
		int rollno=scan.nextInt();
		System.out.println("Enter your Name:");
		String name=scan.next();
		System.out.println("Enter your City:");
		String city=scan.next();
		System.out.println("Enter your Contactno:");
		long contact=scan.nextLong();
		System.out.println("Course selected:ECE");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajalakshmiinstitute","root","6374");
			PreparedStatement stmt=con.prepareStatement("insert into cse(rollno,course,name,city,contact) values(?,?,?,?,?)");
			
			stmt.setInt(1,rollno);
			stmt.setString(2,"ECE");
			stmt.setString(3,name);
			stmt.setString(4,city);
			stmt.setLong(5,contact);
			System.out.println("No.of rows updated="+stmt.executeUpdate());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	

}
