package com.JDBC;

import java.sql.*;

public class JDBCConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 2 load and register the driver
		String drivername="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(drivername);
			
			String username="root";
			String userpass="hrishi2200";
			String url="jdbc:mysql://localhost:3306/studentdb";
			System.out.println("driver loaded and registered");
			try {
				Connection conn=DriverManager.getConnection(url, username, userpass);
				System.out.println("connected to db");
				//String sql="insert into student values(117,'rohan','patil','1998-12-25','male','rohanp@gmail.com',11562,'BA',70)";
			String sql="insert into student values(118,'ritesh','deshmukh','1992-11-11','male','ritesh@gmail.com',6556544,'BCA',85),"
					+ "(119,'ritesh','dahale','1997-12-11','male','riteshd@gmail.com',651554,'BA',85),"
					+ "(120,'ritika','deshmukh','1995-01-21','female','ritika@gmail.com',656666,'BCOM',80)";
				Statement stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("record inserted");
			}else {
				System.out.println("record not inserted");
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//System.out.println("driver not loaded");
		}
		
		
	}

}

//how to add mysql connector jar(java archieve resource)
