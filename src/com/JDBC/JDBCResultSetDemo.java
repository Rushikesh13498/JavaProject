package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class JDBCResultSetDemo {


	static String drivername="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/studentdb";
	static String username="root";
	static  String userpass="hrishi2200";
	static Connection conn;
	static  java.sql.Statement stmt;
	static String sql;
	public static void getConnect() throws ClassNotFoundException,SQLException{
Class.forName(drivername);
System.out.println("driver loaded");
Connection conn=DriverManager.getConnection(url, username, userpass);
System.out.println("connected to db");
stmt=conn.createStatement();
sql="select * from student";


ResultSet rs=stmt.executeQuery(sql);
	
	
	while(rs.next()) {
		int id=rs.getInt(1);
	String fname=rs.getString("sfirstname");
	String lname=rs.getString(3);
	int id1=rs.getInt(9);
	
	System.out.println(id+"|"+fname+" "+lname+" marks:"+id1);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			getConnect();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
