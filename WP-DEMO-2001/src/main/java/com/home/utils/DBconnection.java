package com.home.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	private static final String DRIVER;
	private static final String URL;
	private static final String NAME;
	private static final String PASSWORD;

	static {
		DRIVER = "com.mysql.jdbc.Driver";
		URL = "jdbc:mysql://localhost:3306/mydb";
		NAME = "root";
		PASSWORD = "root";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dont be over smart";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	private DBconnection() {
		System.out.println("private constructor for singleton class");
	}

	private static Connection connection;

	public static Connection getDBconnection() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, NAME, PASSWORD);
			return connection;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
