package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.model.DB;

public class Imageinsertiontest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/aurionpro";
		String userName = "root";
		String password ="root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		String query = "insert into images values(?,?)";
		
		
		
		PreparedStatement pstmt = con.prepareStatement(query);
		FileInputStream file = new FileInputStream("certificate.jpg");
		pstmt.setInt(1, 1);
		pstmt.setBinaryStream(2,file, file.available() );
//		pstmt.setInt(1, 101);
		pstmt.executeUpdate();
		
		System.out.println("image inserted ..!!");
	}

}
