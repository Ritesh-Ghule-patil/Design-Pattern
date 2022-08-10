package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/aurionpro";
		String userName = "root";
		String password ="root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		return con;
	}

}
