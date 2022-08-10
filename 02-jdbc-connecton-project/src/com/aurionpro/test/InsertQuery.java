package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/aurionpro";
		String userName = "root";
		String password ="root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		
		String query = "create table student(id int(20) primary key auto_increment , "
				+ "name varchar(20) not null, city varchar(20))";
		
		//System.out.println(query);
		Statement stmt = con.createStatement();
		int row = stmt.executeUpdate(query);
		System.out.println("Query OK ,"+ row + " rows affected");
		System.out.println("student table is created");
		
		System.out.println("__________________________________\n");
		
		String drop = "drop table demo";
		row = stmt.executeUpdate(drop);
		System.out.println("Query OK ,"+ row + " rows affected");
		System.out.println("demo table is droped");
		con.close();
		
		
		
	}
}
