	package com.JDBC;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.*;
	
public class JDBCPreparedStatementDelete {

		static String driver="com.mysql.cj.jdbc.Driver";
		static String url="jdbc:mysql://localhost:3306/studentdb";
		static String username="root";
		static String userpass="hrishi2200";
		static Connection conn;
		static PreparedStatement ps;
		static String sql;
		
		public static void getConnect() throws ClassNotFoundException,SQLException {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter course id:");
			int cid=sc.nextInt();
		
			
		Class.forName(driver);
		System.out.println("driver loaded");
		
		conn=DriverManager.getConnection(url, username, userpass);
		sql="delete from course where course_id=?";
		ps=conn.prepareStatement(sql);
	
		ps.setInt(1, cid);
		
		System.out.println("Query:"+ps);
		
		int result=ps.executeUpdate();
		if(result>0)
			System.out.println("record deleted");
		else
			System.out.println("record not deleted");
		
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String s;
		
			try {
				getConnect();
			}catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (SQLException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			
		}

	}

