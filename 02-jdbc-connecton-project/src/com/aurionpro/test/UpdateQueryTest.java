package com.aurionpro.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.model.ConnectionProvider;

public class UpdateQueryTest {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionProvider.getConnection();
		
		String query = "update student set name=? , city=? where id=?";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter the id of student you want to update: ");
		int id = sc.nextInt();
		System.out.println("Enter the Name of student you want to update: ");
		String name = sc.next();
		System.out.println("Enter the City of student you want to update: ");
		String city = sc.next();
		
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setInt(3, id);
		
		ps.execute();
		System.out.println("Rows Updated Successfully...!!");
		
	}

}
