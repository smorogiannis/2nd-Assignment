package com.example.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyDb{
	public Connection getConection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "5ggHhJAR1H");
			return conn;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
