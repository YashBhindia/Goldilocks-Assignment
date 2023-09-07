package com.goldilocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problem with loading the driver related main class");
		}
		
		String url = "jdbc:mysql://localhost:3306/question3";
		
//		Connection  conn = DriverManager.getConnection(url, "root", "root");
		try (Connection conn = DriverManager.getConnection(url, "root", "root")) {
			
			PreparedStatement ps = conn.prepaaredStatement("Select * from test");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Emp Name is "+rs.getString("emp name"));
				System.out.println("Emp age is "+rs.getInt("emp age"));
				
				System.out.println("================================");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
