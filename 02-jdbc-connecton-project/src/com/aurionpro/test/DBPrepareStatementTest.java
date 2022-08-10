package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.model.DB;

public class DBPrepareStatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/aurionpro";
		String userName = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, userName, password);

		String query = "insert into student values(?,?,?)";

		DB db = new DB();
		db.insert(con, query);

//		PreparedStatement pstmt = con.prepareStatement(query);

//		pstmt.setInt(1, 101);
//		pstmt.setString(2, "RItesh");
//		pstmt.setString(3, "Jalgaon");
//		
//		pstmt.execute();
//		
//		System.out.println("table updated..!!");
	}

}
