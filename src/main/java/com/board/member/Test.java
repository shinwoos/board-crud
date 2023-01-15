package com.board.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		 try {

	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boards?useSSL=false", 
	                    "root","0000");
	            System.out.println("success");
	            Statement stmt = conn.createStatement();

	        } catch (SQLException ex) {
	            System.out.println("SQLException" + ex);
	        }

	}

}
