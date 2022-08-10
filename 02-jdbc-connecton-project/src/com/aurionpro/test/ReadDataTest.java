package com.aurionpro.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.aurionpro.model.ConnectionProvider;

public class ReadDataTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionProvider.getConnection();

		String query = "select * from student";

		Statement stmt = con.createStatement();

		ResultSet set = stmt.executeQuery(query);

		while (set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);

			System.out.println("id = " + id + " name = " + name + " City = " + city);

		}

	}
}
