package com.example.web;
import com.example.web.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Check{
	public int CheckBarcode(String barcode, Connection conn){
		int result = 0;
		try{
			Statement stmt = conn.createStatement();
			String SEARCH_RECORDS_SQL = "SELECT * FROM rec WHERE barcode='" + barcode + "'";
			ResultSet rs = stmt.executeQuery(SEARCH_RECORDS_SQL);
			if(rs.next()){//vrike
				result = 1;
			}else{
				result = 0;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	
	}
}
