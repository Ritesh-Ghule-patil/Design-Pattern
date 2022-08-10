package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DB {
	
	static Scanner sc = new Scanner(System.in);
	
	public void insert(Connection con, String query) throws SQLException {
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		System.out.println("Enter Student id : ");
		pstmt.setInt(1, sc.nextInt());
		System.out.println("Enter Student Name : ");
		pstmt.setString(2, sc.next());
		System.out.println("Enter Student CityName : ");
		pstmt.setString(3, sc.next());
		
		pstmt.execute();
		
		System.out.println("row Updated Successfully");
		
	}
}
