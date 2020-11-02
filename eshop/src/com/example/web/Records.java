package com.example.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Records{
	  
	private String name;
	private String barcode;
	private String color;
	private String desc;
	
	public String getName(){
		return name;
	}
	public String getBarcode(){
		return barcode;
	}
	public String getColor(){
		return color;
	}
	public String getDesc(){
		return desc;
	}
	
	public void setName(String nam){
		this.name = nam;
	}
	public void setBarcode(String bc){
		this.barcode = bc;
	}
	public void setColor(String clr){
		this.color = clr;
	}
	public void setDesc(String dscr){
		this.desc = dscr;
	}
	public int setRc(Records rcs, Connection conn){
		String INSERT_RECORDS_SQL = ("INSERT INTO rec" + "(name, color, descr, barcode) VALUES " + "(?,?,?,?);");
		
		int result = 0;
		try{
			PreparedStatement preparedStatement = conn.prepareStatement(INSERT_RECORDS_SQL);
			preparedStatement.setString(1,  rcs.getName());
			preparedStatement.setString(2,  rcs.getColor());
			preparedStatement.setString(3,  rcs.getDesc());
			preparedStatement.setString(4,  rcs.getBarcode());
			result = preparedStatement.executeUpdate();
			return result;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
	}
}
